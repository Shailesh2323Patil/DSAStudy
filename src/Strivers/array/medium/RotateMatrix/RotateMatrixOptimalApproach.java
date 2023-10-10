package Strivers.array.medium.RotateMatrix;

public class RotateMatrixOptimalApproach {
    public static void main(String[] args) {
        int arr[][] =  {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}, {23, 24, 25, 26}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] matrix) {
        // find out the transpose of matrix
        int row = matrix.length;
        int col = matrix[0].length;
        int size = matrix.length;

        for(int i=0; i<row; i++) {
            for(int j=i; j<col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the transpose matrix
        for(int i=0; i<size; i++) {
            for(int j=0; j<size/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size-j-1];
                matrix[i][size-j-1] = temp;
            }
        }
    }
}
