package Strivers.array.medium.FindTheNumberThatAppears1;

public class FindTheNumberThatAppears1Optimal {
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = singleNumber(arr);
        System.out.println("The single element is: " + ans);
    }

    private static int singleNumber(int[] nums) {
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }
}
