package Strivers.sorting.striver;

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = selection_sort(arr, n);

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] selection_sort(int arr[], int size) {
        for (int i = 0; i < size-1; i++) {
            int mini = i;

            for (int j = i+1; j < size; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
