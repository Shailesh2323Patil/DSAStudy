package Strivers.recursion.Medium.SubSetSum2;

import java.util.ArrayList;
import java.util.HashSet;

public class SubSetSum2BruteForce {

    public static void main(String args[]) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        HashSet<ArrayList<Integer>> ans = subsetSums(arr, arr.size());
        System.out.println("The sum of each subset is ");
        System.out.println(ans);
    }

    static HashSet<ArrayList<Integer>> subsetSums(ArrayList < Integer > arr, int N) {
        HashSet<ArrayList<Integer>> sumSubset = new HashSet<>();
        ArrayList<Integer> ds = new ArrayList<>();
        subsetSumsHelper(0, ds, arr, N, sumSubset);
        return sumSubset;
    }


    private static void subsetSumsHelper(int index, ArrayList<Integer> ds, ArrayList<Integer> arr, int N, HashSet<ArrayList<Integer>> subset) {
        if(index == N) {
            subset.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr.get(index));
        // pick the element
        subsetSumsHelper(index+1, ds,arr, N, subset);

        ds.remove(ds.size() - 1);
        // Do-not pick the element
        subsetSumsHelper(index+1, ds, arr, N, subset);
    }
}
