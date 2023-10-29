package ShardhaDidi.array2D;

import java.util.Scanner;

/*
* YouTube : https://www.youtube.com/watch?v=18Zt5I4S45o&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=11
* Notes : https://docs.google.com/document/d/1XkI6549bd-qDvcUC88WuOW0ISPfrtm-Tk06pt_I-89I/edit
* */
public class PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Row : "+rows);
        System.out.println("Column : "+cols);

        int[][] array = new int[rows][cols];

        System.out.println("------Input----------------------");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("------Output----------------------");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
