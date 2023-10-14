package Strivers.array.medium.MajorityElement_N_Greater_2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetterApproach {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<size; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
        }

        for(Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue() > size/2) {
                return pair.getKey();
            }
        }

        return -1;
    }
}
