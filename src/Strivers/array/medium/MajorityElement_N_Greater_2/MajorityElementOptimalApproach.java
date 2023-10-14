package Strivers.array.medium.MajorityElement_N_Greater_2;

public class MajorityElementOptimalApproach {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    /**
     * Moore’s Voting Algorithm
     * */
    public static int majorityElement(int[] arr) {
        int count = 0;
        int element = 0;
        int size = arr.length;

        //applying the algorithm
        for(int i=0; i<size; i++) {
            if(count == 0) {
                count++;
                element = arr[i];
            }
            else if(element == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        // checking if the stored element
        // is the majority element
        int countOfElement = 0;
        for(int i=0; i<size; i++) {
            if(element == arr[i]) {
                countOfElement++;
            }
        }

        if(countOfElement > size/2) {
            return element;
        }
        else {
            return -1;
        }
    }
}
