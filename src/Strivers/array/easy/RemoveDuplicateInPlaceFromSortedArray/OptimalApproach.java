package Strivers.array.easy.RemoveDuplicateInPlaceFromSortedArray;

public class OptimalApproach {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};

        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i = i + 1;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
}
