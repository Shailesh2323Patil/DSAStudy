package Strivers.recursion.Easy;

public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1,2,3,4,5 };

        reverseArray(0, n-1, arr);

        printArray(arr, n);
    }

    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int start, int end, int[] arr) {
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(start+1, end-1, arr);
        }
    }
}
