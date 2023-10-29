package ShardhaDidi.array2D;

import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Row : ");
        int row = scanner.nextInt();

        System.out.print("Enter Columns : ");
        int cols = scanner.nextInt();

        int[][] array = new int[row][cols];

        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Element Find : ");
        int findElement = scanner.nextInt();


        System.out.println("---Output----------------");

        for (int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(array[i][j] == findElement) {
                    System.out.println("Element Found at : Row "+i+" Column "+j);
                }
            }
        }
    }
}
