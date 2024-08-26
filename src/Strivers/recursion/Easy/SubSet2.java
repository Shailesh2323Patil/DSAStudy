package Strivers.recursion.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2 {
    static void printAns(List<List<Integer>> ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }

    public static void findTheSubSet(int ind, List<Integer> ds, List<List<Integer>> answer, int[] nums)
    {
        answer.add(new ArrayList<>(ds));

        for(int i=ind; i<nums.length; i++) {
            if(i != ind && nums[i] == nums[i - 1]) {
                continue;
            }

            ds.add(nums[i]);
            findTheSubSet(i+1, ds, answer, nums);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findTheSubSet(0, new ArrayList<>(), ansList, nums);
        return ansList;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2};

        List<List<Integer>> ans = subsetsWithDup(nums);
        printAns(ans);
    }
}
