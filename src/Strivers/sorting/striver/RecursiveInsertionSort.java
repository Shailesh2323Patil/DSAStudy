package Strivers.sorting.striver;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        insertion_sort(arr, 0, n);
        System.out.println("After Using insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_sort(int[] arr, int i, int n) {
        if(i == arr.length) {
            return;
        }

        int j = i;

        while (j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;

            j--;
        }

        insertion_sort(arr, i+1, n);
    }
}
