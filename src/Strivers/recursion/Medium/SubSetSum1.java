package Strivers.recursion.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum1 {

    public static void main(String args[]) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    static ArrayList< Integer> subsetSums(ArrayList < Integer > arr, int N) {
        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }


    private static void subsetSumsHelper(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> subset) {
        if(index == N) {
            subset.add(sum);
            return;
        }

        // pick the element
        subsetSumsHelper(index+1, sum+arr.get(index),arr, N, subset);

        // Do-not pick the element
        subsetSumsHelper(index+1, sum, arr, N, subset);
    }
}
