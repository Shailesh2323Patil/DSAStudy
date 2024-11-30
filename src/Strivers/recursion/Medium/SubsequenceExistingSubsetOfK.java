package Strivers.recursion.Medium;

public class SubsequenceExistingSubsetOfK {

    /** Coding Ninjas
     * You are given an array 'A' of 'N' integers. You have to return true if there exists a subset of
     * elements of 'A' that sums up to 'K'. Otherwise, return false.
     * For Example
     * 'N' = 3, 'K' = 5, 'A' = [1, 2, 3].
     * Subset [2, 3] has sum equal to 'K'.
     * So our answer is True.
     * */
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;
        int n = arr.length;

        Boolean value = isSubsetPresent(n, sum, arr);
        System.out.println("The SubSet Sum Of Count "+sum+" is available "+value);
    }

    public static boolean isSubsetPresent(int n, int k, int[] a) {
        return subsequenceSum(n, k, a, 0, 0);
    }

    public static boolean subsequenceSum(int n, int sum, int[] arr, int index, int calculatedSum) {
        if(calculatedSum > sum) {
            return false;
        }

        if(index == n) {
            if(sum == calculatedSum) {
                return true;
            }
            return false;
        }

        // Picking the Next Element
        // Adding arr[index] in arrayList data
        calculatedSum += arr[index];
        if(subsequenceSum(n, sum, arr, index+1, calculatedSum) == true) {
            return true;
        }

        // Not Picking the Next Element
        // Removing Last Data from arrayList data
        calculatedSum -= arr[index];
        if(subsequenceSum(n, sum, arr, index+1, calculatedSum) == true) {
            return true;
        }

        return false;
    }
}
