package Strivers.array.easy.LeadersInAnArray;

import java.util.ArrayList;

public class LeaderInAnArrayBrute {
    public static void main(String args[])
    {
        // Array Initialization.
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= printLeadersBruteForce(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    private static ArrayList<Integer> printLeadersBruteForce(int arr[]){

        ArrayList<Integer> ans = new ArrayList();

        Boolean leader = false;

        for(int i=0; i<arr.length; i++) {

            leader = true;

            for(int j=i+1; j<arr.length; j++) {

                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if(leader) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}
