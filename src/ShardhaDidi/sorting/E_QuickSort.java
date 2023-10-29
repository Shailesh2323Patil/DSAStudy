package ShardhaDidi.sorting;


import java.util.Arrays;

public class E_QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,3,1,2};

        int n = arr.length - 1;

        quickSort(arr, 0, n);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1;

        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;

                // SWAP
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // SWAP with Pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
