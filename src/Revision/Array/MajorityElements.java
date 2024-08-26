package Revision.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = hashMap.getOrDefault(arr[i], 0);
            hashMap.put(arr[i], value+1);
        }

        for(Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
            if(pair.getValue() > arr.length / 2) {
                return pair.getKey();
            }
        }

        return -1;
    }
}
