package Strivers.stack_queue.Easy.NextSmallerElement;

import java.util.Stack;

// Reverse Condition From TUF Answer Of Next Greater Element
public class NextSmallerElementTUF {
    public static void main(String[] args) {
        int arr[]={5,7,1,2,6,0};

        int arr2[] = nextSmallerElements(arr);
        System.out.println("The next smaller elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] nextSmallerElements(int[] arr) {
        int size = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] nse = new int[size];

        for(int i=0; i<=size-1; i++) {
            while(!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if(!stack.empty()) {
                nse[i] = stack.peek();
            }
            else {
                nse[i] = -1;
            }

            stack.push(arr[i]);
        }

        return nse;
    }
}
