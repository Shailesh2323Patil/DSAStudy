package Strivers.array.medium.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosOptimalApproach {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1)));

        System.out.println("The Initial Array : ");
        for(ArrayList<Integer> arrayList : matrix) {
            for(Integer element : arrayList) {
                System.out.print(element+" ");
            }
            System.out.println();
        }

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> answer = setMatrixZeros(matrix, rows, cols);

        System.out.println("The Final Array : ");
        for(ArrayList<Integer> arrayList : answer) {
            for(Integer element : arrayList) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> setMatrixZeros(ArrayList<ArrayList<Integer>> matrix, int rowSize, int colSize) {

        int col0 = 1;

        for(int row=0; row<rowSize; row++) {
            for(int col=0; col<colSize; col++) {
                if(matrix.get(row).get(col) == 0) {
                    matrix.get(row).set(0,0);

                    if(col != 0) {
                        matrix.get(0).set(col, 0);
                    }
                    else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int row=1; row<rowSize; row++) {
            for(int col=1; col<colSize; col++) {
                // Check the Position matrix.get(row, col) is non 0
                if(matrix.get(row).get(col) != 0) {
                    // check the current Row's Oth Element is 0 OR
                    // check the current Col's Oth Element is 0
                    if(matrix.get(row).get(0) == 0 || matrix.get(0).get(col) == 0) {
                        matrix.get(row).set(col, 0);
                    }
                }
            }
        }

        // Check for first Row's (0,0) is 0 to mark all 0
        if(matrix.get(0).get(0) == 0) {
            // it travers in total column's
            for(int i=0; i<colSize; i++) {
                // marking every element of first row as 0
                matrix.get(0).set(i, 0);
            }
        }

        // Check for col0 is 0 to mark first Column
        if(col0 == 0) {
            // it travers in total row's
            for (int i=0; i<rowSize; i++) {
                // marking every element of first colum as 0
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}
