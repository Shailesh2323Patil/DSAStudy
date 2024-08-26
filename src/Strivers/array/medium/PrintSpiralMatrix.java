package Strivers.array.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintSpiralMatrix {

    public static void main(String[] args) {
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }

    private static ArrayList<Integer> printSpiral(int[][] mat) {
        int nor = mat.length; // no. of rows
        int noc = mat[0].length; // no. of columns

        // Initialize the pointers required for traversal.
        int top = 0;
        int left = 0;
        int right = noc - 1;
        int bottom = nor - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for(int i=left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // For moving top to bottom.
            for (int i = top; i<=bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // For moving right to left.
            if(top <= bottom) {
                for (int i=right; i>=left ; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            // For moving bottom to top.
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

}
