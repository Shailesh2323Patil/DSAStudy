package Strivers.array.easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
