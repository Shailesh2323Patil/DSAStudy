package Strivers.array.medium.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosBruteForce {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

        // Checking Initial Matrix
        System.out.println("The Matrix :");
        for(ArrayList<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> answer = setZeroMatrix(matrix, rows, cols);

        // Checking Final Matrix
        System.out.println("The Final Matrix : ");
        for(ArrayList<Integer> row : answer) {
            for(Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> setZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int mRowSize, int mColSize) {

        // Find the Element Which Has 0
        for(int row=0; row<mRowSize; row++) {
            for(int col=0; col<mColSize; col++) {
                if(matrix.get(row).get(col) == 0) {
                    // Set Row Element as -1
                    markRow(matrix, mRowSize, row);
                    // Set Column Element as -1
                    markCol(matrix, mColSize, col);
                }
            }
        }

        // Mark All -1 as 0
        for(int row=0; row<mRowSize; row++) {
            for(int col=0; col<mColSize; col++) {
                if(matrix.get(row).get(col) == -1) {
                    matrix.get(row).set(col, 0);
                }
            }
        }

        return matrix;
    }

    // Mark Total Row as -1
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int size, int row) {
        for (int i=0; i<size; i++) {
            if(matrix.get(row).get(i) != 0) {
                matrix.get(row).set(i, -1);
            }
        }
    }

    // Mark Total Col as -1
    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int size, int col) {
        for(int j=0; j<size; j++) {
            if(matrix.get(j).get(col) != 0) {
                matrix.get(j).set(col, -1);
            }
        }
    }
}
