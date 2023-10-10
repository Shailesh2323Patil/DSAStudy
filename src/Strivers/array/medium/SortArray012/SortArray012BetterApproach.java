package Strivers.array.medium.SortArray012;

public class SortArray012BetterApproach {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[] {0, 2, 1, 2, 0, 1};
        sortArray(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortArray(int[] nums) {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                num0++;
            }
            else if(nums[i] == 1) {
                num1++;
            }
            else {
                num2++;
            }
        }


        for(int i=0; i<num0; i++) {
            nums[i] = 0;
        }

        for(int i=num0; i<num0+num1; i++) {
            nums[i] = 1;
        }

        for(int i=num0+num1; i<num0+num1+num2; i++) {
            nums[i] = 2;
        }
    }
}
