package Strivers.array.medium.FindDuplicateInArrayN_Plus_1;

public class FindDuplicateInArrayBetterApproach {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }

    private static int findDuplicate(int arr[]) {
        int size = arr.length;
        int[] freqArray = new int[size+1];

        for (int i = 0; i < size; i++) {
            if(freqArray[arr[i]] == 0) {
                freqArray[arr[i]] += 1;
            }
            else {
                return arr[i];
            }
        }
        return 0;
    }
}
