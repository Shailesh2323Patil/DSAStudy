package Strivers.array.medium.TwoSum;

public class TwoSumBruteForce {
    public static void main(String args[]) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int size = nums.length;

        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;

                    return answer;
                }
            }
        }

        return answer;
    }
}
