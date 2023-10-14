package Strivers.array.medium.TwoSum;

import java.util.*;

public class TwoSumBetterApproach {
    public static void main(String args[]) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int size = arr.length;

        for(int i=0; i<size; i++) {
            int moreNeeded = target - arr[i];

            if(hashMap.containsKey(moreNeeded)) {
                ans[0] = hashMap.get(moreNeeded);
                ans[1] = i;

                return ans;
            }

            hashMap.put(arr[i], i);
        }

        return ans;
    }
}
