package Strivers.array.easy.LeadersInAnArray;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArrayOptimal {
    public static void main(String args[])
    {
        // Array Initialization.
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= printLeadersBruteForce(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    private static ArrayList<Integer> printLeadersBruteForce(int arr[], int n){

        ArrayList<Integer> ans = new ArrayList();

        int max = arr[n-1];
        ans.add(max);

        for(int i=n-2; i>=0; i--) {
            if(arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}
