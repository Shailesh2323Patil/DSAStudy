package Strivers.array.medium.MajorityElement_N_Greater_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementBetter {

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    public static List<Integer> majorityElement(int[] arr) {
        int n = arr.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element:
        int mini = (int)(n / 3) + 1;

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(arr[i]) == mini) {
                ls.add(arr[i]);
            }
            if (ls.size() == 2) break;
        }

        return ls;
    }


}
