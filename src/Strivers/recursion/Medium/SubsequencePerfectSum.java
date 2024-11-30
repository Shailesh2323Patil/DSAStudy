package Strivers.recursion.Medium;

import java.util.ArrayList;

public class SubsequencePerfectSum {

    /** GFG
     * Given an array arr of size n of non-negative integers and an integer sum,
     * the task is to count all subsets of the given array with a sum equal to a given sum.
     * */
    public static void main(String[] args) {
        //int[] arr = {5, 2, 3, 10, 6, 8};
        //int sum = 10;

        int[] arr = {1,2,1};
        int sum = 2;

        int count = perfectSum(arr, arr.length, sum);
        System.out.println("The Count "+10+" achieved by "+count);
    }

    private static int perfectSum(int arr[],int n, int sum)
    {
        return subsequenceSum(arr, n, sum, 0, 0, new ArrayList<Integer>());
    }

    private static int subsequenceSum(int arr[], int n, int sum, int index, int calculatedSum, ArrayList<Integer> data) {
        if(index == n) {
            if(calculatedSum == sum) {
                System.out.println(data);
                return 1;
            }
            return 0;
        }

        // Picking the Next Element
        // Adding arr[index] in arrayList data
        data.add(arr[index]);
        calculatedSum += arr[index];
        int left = subsequenceSum(arr, n, sum, index+1, calculatedSum, data);

        // Not Picking the Next Element
        // Removing Last Data from arrayList data
        data.remove(data.size() - 1);
        calculatedSum -= arr[index];
        int right = subsequenceSum(arr, n, sum, index+1, calculatedSum, data);

        return left + right;
    }
}
