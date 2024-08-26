package Strivers.array.easy;

public class RotateRightArrayByXPlaces {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4};
        int k = 3;
        RotateToRight(arr, arr.length, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RotateToRight(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }

        k = k % n;

        if (k > n) {
            return;
        }

        int[] temp = new int[k];

        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
