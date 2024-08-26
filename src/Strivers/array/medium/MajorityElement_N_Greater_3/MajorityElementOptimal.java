package Strivers.array.medium.MajorityElement_N_Greater_3;

import java.util.List;
import java.util.ArrayList;

public class MajorityElementOptimal {
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    private static List<Integer> majorityElement(int[] nums) {
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(cnt1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                cnt2++;
            }
            else if(nums[i] == el1) {
                cnt1++;
            }
            else if(nums[i] == el2) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i=0; i<n; i++) {
            if(el1 == nums[i]) {
                cnt1++;
            }

            if(el2 == nums[i]) {
                cnt2++;
            }
        }

        if(cnt1 >= n/3+1) {
            list.add(el1);
        }

        if(cnt2 >= n/3+1) {
            list.add(el2);
        }

        return list;
    }
}
