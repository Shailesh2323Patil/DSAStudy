package Strivers.array.easy;

public class RotateLeftArrayByOnePlace {
    public static void main(String args[]) {
        int n=5;
        int arr[]= {1,2,3,4,5};
        LeftRotateArray(arr, n);
    }


    private static void LeftRotateArray(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 0; i < n -1; i++) {
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
