package Strivers.array.medium.FindTheNumberThatAppears1;

import java.util.*;
public class FindTheNumberThatAppears1Better {
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = singleNumber(arr);
        System.out.println("The single element is: " + ans);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for(int i=0; i<nums.length; i++) {
            int value = hashMap.getOrDefault(nums[i], 0);
            hashMap.put(nums[i], value+1);
        }

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
