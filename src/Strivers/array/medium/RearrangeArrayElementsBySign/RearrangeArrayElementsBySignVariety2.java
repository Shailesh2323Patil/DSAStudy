package Strivers.array.medium.RearrangeArrayElementsBySign;

import java.util.ArrayList;
import java.util.Collections;

public class RearrangeArrayElementsBySignVariety2 {
    public static void main(String[] args) {
        // Array Initialization.
        //int[] A = {1, 2, -4, -5};
        //int[] A = {3,1,-2,-5,2,-4};
        int[] A = {1,2,-3,-1,-2,-3};
        //int[] A = {1,2,-3,-1,2,3};
        int[] ans = alternateNumbers(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] alternateNumbers(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            }
            else {
                pos.add(arr[i]);
            }
        }

        if(pos.size() < neg.size()) {
            for(int i=0; i<pos.size(); i++) {
                ans.set(2*i, pos.get(i));
                ans.set(2*i+1, neg.get(i));
            }

            int index = pos.size() * 2;

            for(int i=pos.size(); i<neg.size(); i++) {
                ans.set(index, neg.get(i));
                index++;
            }
        }
        else {
            for(int i=0; i<neg.size(); i++) {
                ans.set(2*i, pos.get(i));
                ans.set(2*i+1, neg.get(i));
            }

            int index = neg.size()*2;

            for(int i=neg.size(); i<pos.size(); i++) {
                ans.set(index, pos.get(i));
                index++;
            }
        }
        
        for(int i=0; i<ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}
