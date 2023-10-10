package Strivers.array.medium.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosBetterApproach {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

        System.out.println("The Initial Matrix : ");

        for (ArrayList<Integer> data : matrix) {
            for(Integer element : data) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        System.out.println("The Final Matrix : ");
        ArrayList<ArrayList<Integer>> answer = setMatrixZero(matrix, rows, cols);

        for (ArrayList<Integer> row  : answer) {
            for (Integer element : row) {
                System.out.print(element +" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int rowSize, int colSize) {

        // Set the UpperRow Array & SideColumn Array
        int[] upperCol = new int[rowSize];
        int[] sideRow = new int[colSize];

        // Set All UpperRow and SideCol as 1, If we found matrix(row, col) as 0
        for(int row=0; row<rowSize; row++) {
            for(int col=0; col<colSize; col++) {
                if(matrix.get(row).get(col) == 0) {
                    upperCol[row] = 1;
                    sideRow[col] = 1;
                }
            }
        }

        // Set matrix(row, col) as 0, If we Found UpperRow or SideCol as 1
        for(int row=0; row<rowSize; row++) {
            for (int col=0; col<colSize; col++) {
                if(upperCol[row] == 1 || sideRow[col] == 1) {
                    matrix.get(row).set(col, 0);
                }
            }
        }

        return matrix;
    }
}
