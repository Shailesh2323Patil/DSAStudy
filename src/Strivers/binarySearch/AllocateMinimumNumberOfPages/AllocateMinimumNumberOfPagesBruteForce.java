package Strivers.binarySearch.AllocateMinimumNumberOfPages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllocateMinimumNumberOfPagesBruteForce {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        for(int pages=low; pages<high; pages++) {
            if(countPage(arr, pages) == m) {
                return pages;
            }
        }

        return -1;
    }

    public static int countPage(ArrayList<Integer> arr, int pages) {
        int pageStudent = 0;
        int student = 1;

        for(int i=0; i<arr.size(); i++) {
            if(pageStudent + arr.get(i) <= pages) {
                pageStudent += arr.get(i);
            }
            else {
                student++;
                pageStudent = arr.get(i);
            }
        }

        return student;
    }
}
