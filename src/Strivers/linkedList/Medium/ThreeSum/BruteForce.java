package Strivers.linkedList.Medium.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    static List<List<Integer>> triplet(int n, int[] arr) {
        HashSet<List<Integer>> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        hashSet.add(temp);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(hashSet);
        return ans;
    }
}
