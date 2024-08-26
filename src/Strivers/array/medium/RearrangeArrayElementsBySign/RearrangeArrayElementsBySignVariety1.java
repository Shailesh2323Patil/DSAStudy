package Strivers.array.medium.RearrangeArrayElementsBySign;

import java.util.ArrayList;
import java.util.Collections;

public class RearrangeArrayElementsBySignVariety1 {
    public static void main(String[] args) {
        // Array Initialization.
        //int[] A = {1, 2, -4, -5};
        int[] A = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                ans.set(negIndex, nums[i]);
                negIndex += 2;
            }
            else {
                ans.set(posIndex, nums[i]);
                posIndex += 2;
            }
        }

        for(int j=0; j<ans.size(); j++) {
            nums[j] = ans.get(j);
        }

        return nums;
    }
}
