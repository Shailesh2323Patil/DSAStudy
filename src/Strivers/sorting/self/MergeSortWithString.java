package Strivers.sorting.self;

import java.util.ArrayList;

public class MergeSortWithString {

    public static void main(String args[]) {
        String arr[] = { "D", "C", "B" , "A" , "P" ,"Q"};

        int n = arr.length;

        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, n - 1);

        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] arr, int low, int high){
        if(low >= high) {
            return;
        }

        int mid = (low+high) / 2;

        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid+1, high); // right half
        merge(arr, low, mid, high); // merging sorted halves
    }

    public static void merge(String[] arr, int low, int mid, int high) {
        ArrayList<String> temp = new ArrayList<>();  // temporary array
        int left = low;   // starting index of left half of arr
        int right = mid+1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//
        while(left <= mid && right <= high) {
            if(arr[left].compareTo(arr[right]) < 0) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr //
        for(int i=low,j=0; i<=high; i++, j++) {
            arr[i] = temp.get(j);
        }
    }
}
