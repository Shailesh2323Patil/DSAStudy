package Strivers.array.medium.ThreeSum;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class ThreeSumBrute {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    ArrayList<Integer> list = new ArrayList<>();
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == 0) {
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);

                        list.sort(null);

                        set.add(list);
                    }
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
