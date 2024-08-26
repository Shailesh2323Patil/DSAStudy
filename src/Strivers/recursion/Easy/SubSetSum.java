package Strivers.recursion.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {
    public static void main(String args[]) {
        ArrayList< Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arrayList, int N) {
        ArrayList<Integer> subSet = new ArrayList<>();
        subsetSumsHelper(0, 0, arrayList, N, subSet);
        Collections.sort(subSet);
        return subSet;
    }

    static void subsetSumsHelper(int index, int sum, ArrayList<Integer> arrayList, int N, ArrayList<Integer> subSet) {
        if(index == N) {
            subSet.add(sum);
            return;
        }

        // Pick The Element
        subsetSumsHelper(index+1, sum+arrayList.get(index),arrayList, N, subSet);

        // Do Not Pick The Element
        subsetSumsHelper(index+1, sum, arrayList, N, subSet);
    }
}
