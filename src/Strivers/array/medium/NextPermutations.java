package Strivers.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutations {
    public static List<Integer> nextGreaterPermutation(List<Integer> list) {
        int n = list.size();
        int breakIndex = -1;

        // Find the BreakIndex
        for(int i=n-2; i>=0; i--) {
            if(list.get(i) < list.get(i+1)) {
                breakIndex = i;
                break;
            }
        }

        // If BreakIndex is -1 then reverse a List
        if(breakIndex == -1) {
            Collections.reverse(list);
            return list;
        }

        // Find Out the Next Greater Element Of BreakIndex
        for(int i=n-1; i>breakIndex; i--) {
            if(list.get(i) > list.get(breakIndex)) {
                int temp = list.get(breakIndex);
                list.set(breakIndex, list.get(i));
                list.set(i, temp);
                break;
            }
        }

        // Revers Remaining Element
        List<Integer> sublist = list.subList(breakIndex+1, n);

        Collections.reverse(sublist);

        return list;
    }

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {1,2,3});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
