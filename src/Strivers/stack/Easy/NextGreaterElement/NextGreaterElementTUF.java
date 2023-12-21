package Strivers.stack.Easy.NextGreaterElement;

import java.util.Stack;

public class NextGreaterElementTUF {
    public static void main(String[] args) {
        int arr[]={5,7,1,2,6,0};

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (stack.empty() == false && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            if(i < n) {
                if(stack.empty() == false) {
                    nge[i] = stack.peek();
                }
                else {
                    nge[i] = -1;
                }
            }

            stack.push(nums[i % n]);
        }

        return nge;
    }
}
