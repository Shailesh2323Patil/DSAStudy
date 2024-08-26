package Strivers.array.medium.LongestSubarrayWithZero;

import java.util.*;

public class LongestSubArrayWithZeroOptimal {
    public static void main(String args[])
    {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen(a));
    }

    private static int maxLen(int arr[])
    {
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = arr.length;

        for(int i=0; i<n; i++) {
            sum += arr[i];

            if(sum == 0) {
                max = i+1;
            }
            else {
                if(hashMap.get(sum) != null) {
                    max = Math.max(max, i - hashMap.get(sum));
                }
                else {
                    hashMap.put(sum, i);
                }
            }
        }

        return max;
    }
}
