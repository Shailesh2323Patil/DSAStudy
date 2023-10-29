package ShardhaDidi.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums1) {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        if(nums.length < 3) {
            return nums.length;
        }

        int index = 2;
        for(int i=2; i<nums.length; i++)
        {
            if(nums[i] != nums[index-2])
            {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
