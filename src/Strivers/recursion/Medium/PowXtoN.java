package Strivers.recursion.Medium;

public class PowXtoN {
    public static void main(String[] args) {
        double number = 2.0;
        int power = -2;

        System.out.println("The "+number+" of power "+power+" is "+powXN(number, power));
    }

    private static double powXN(double number, int power) {
        double ans = 1;
        long nn = power;

        if(nn < 0) {
            nn = nn * -1;
        }

        while (nn > 0) {
            if(nn % 2 == 0) {
                number = number * number;
                nn = nn / 2;
            }
            else {
                ans = ans * number;
                nn = nn - 1;
            }
        }

        if (power < 0) {
            ans = (double)(1.0) / (double)(ans);
        }

        return ans;
    }
}
