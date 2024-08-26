package Strivers.array.medium.PascalTraingle;

public class Variation2Brute {
    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }

    private static long nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }

    private static void pascalTriangle(int r) {
        for (int c = 1; c <= r; c++) {
            System.out.print(nCr(r-1, c-1)+" ");
        }
        System.out.println();
    }
}
