package Strivers.array.medium.PascalTraingle;

public class Variation1 {
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        long element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }

    public static long nCr(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }

    private static long pascalTriangle(int r, int c) {
        return nCr(r-1, c-1);
    }
}
