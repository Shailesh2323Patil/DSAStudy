package Strivers.array.medium.FindDuplicateInArrayN_Plus_1;

import java.util.Arrays;

public class FindDuplicateInArrayBruteForce {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }

    private static int findDuplicate(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            if(arr[i] == arr[i+1]) {
                return arr[i];
            }
        }

        return 0;
    }
}
