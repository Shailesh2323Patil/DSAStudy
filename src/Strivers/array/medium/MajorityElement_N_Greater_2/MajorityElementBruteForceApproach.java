package Strivers.array.medium.MajorityElement_N_Greater_2;

public class MajorityElementBruteForceApproach {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int[] arr) {
        int size = arr.length;

        for(int i=0; i<size; i++) {
            int count = 0;
            for(int j=0; j<size; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > size/2) {
                return arr[i];
            }
        }

        return -1;
    }
}
