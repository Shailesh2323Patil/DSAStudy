package Strivers.array.medium.PascalTraingle;

public class Variation2Optimal {
    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }

    private static void pascalTriangle(int n) {
        int ans = 1;

        System.out.print(ans+" ");

        for (int i = 1; i < n; i++) {
            ans = ans * (n-i);
            ans = ans / i;

            System.out.print(ans+" ");
        }

        System.out.println();
    }
}
