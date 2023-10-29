package ShardhaDidi.array2D;

import java.util.Scanner;

public class SpiralModal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set the Rows : ");
        int m = scanner.nextInt();
        System.out.println();

        System.out.print("Set the Column : ");
        int n = scanner.nextInt();
        System.out.println();

        int[][] matrix = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("The Spiral Modal : ");

        int row_start = 0;
        int row_end = m-1;

        int col_start = 0;
        int col_end = n-1;

        while (row_start <= row_end && col_start <= col_end) {

            // Start Moving from Column Start to Colum End in Start Row
            for(int i = col_start; i <= col_end; i++) {
                System.out.print(matrix[row_start][i]);
                System.out.print(" ");
            }

            row_start++;

            // Start Moving from Row Start to Row End in End Column
            for(int i = row_start; i <= row_end; i++) {
                System.out.print(matrix[i][col_end]);
                System.out.print(" ");
            }

            col_end--;

            // Start Moving from Column End to Colum Start in End Row
            for(int i = col_end; i >= col_start; i--) {
                System.out.print(matrix[row_end][i]);
                System.out.print(" ");
            }

            row_end--;

            // Start Moving from Row Last to Row Start in Start Column
            for(int i = row_end; i >= row_start; i--) {
                System.out.print(matrix[i][col_start]);
                System.out.print(" ");
            }

            col_start++;
        }
    }
}
