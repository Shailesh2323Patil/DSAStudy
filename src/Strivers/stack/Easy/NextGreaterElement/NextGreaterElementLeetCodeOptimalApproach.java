package Strivers.stack.Easy.NextGreaterElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementLeetCodeOptimalApproach {
    public static void main(String[] args) {
//        int arr[]={4,1,2};
//        int arr2[]={1,3,4,2};

        int arr[]={1,3,5,2,4};
        int arr2[]={6,5,4,3,2,1,7};

        int ans[] = nextGreaterElements(arr, arr2);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] nextGreaterElements(int[] num1, int[] num2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : num2) {
            while (!stack.empty() && stack.peek() < num) {
                hashMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < num1.length; i++) {
            num1[i] = hashMap.containsKey(num1[i]) ? hashMap.get(num1[i]) : -1;
        }

        return num1;
    }
}
