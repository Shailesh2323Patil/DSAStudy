package Strivers.array.easy.RemoveDuplicateInPlaceFromSortedArray;

import java.util.HashSet;

public class BruteForceApproach {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};

        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        HashSet<Integer> hashSet = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        int size = hashSet.size();
        int j = 0;

        for (int x: hashSet) {
            arr[j++] = x;
        }

        return size;
    }
}
