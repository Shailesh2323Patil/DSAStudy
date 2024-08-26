package Strivers.binarySearch.MedianOfRowWiseSortedMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfRowWiseSortedMatrixBruteForce {
    public static int median(int matrix[][], int m, int n) {
        List<Integer> lst = new ArrayList<>();

        // Traverse the matrix and
        // copy the elements to the list:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                lst.add(matrix[i][j]);
            }
        }

        // Sort the list:
        Collections.sort(lst);
        return lst.get((m * n) / 2);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4, 5},
                {8, 9, 11, 12, 13},
                {21, 23, 25, 27, 29}
        };
        int m = matrix.length, n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}
