package Strivers.array.easy;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
    public static int[] moveZeros(int[] nums) {
        int n = nums.length;

        int i = 0;

        for(i=0; i<n; i++) {
            if(nums[i] == 0) {
                break;
            }
        }

        for(int j=i+1; j<n; j++) {
            if(nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }

        return nums;
    }
}
