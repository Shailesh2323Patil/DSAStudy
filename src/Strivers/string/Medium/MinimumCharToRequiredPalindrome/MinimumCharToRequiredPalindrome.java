package Strivers.string.Medium.MinimumCharToRequiredPalindrome;

public class MinimumCharToRequiredPalindrome {
    public static void main(String[] args) {
        String value = "ABFACD";
        //String value = "AACECAAAA";
        //String value = "ACECAA";
        //String value = "hqghumeaylnlfdxfi";

        System.out.println("Count Required for Palindrome = "+solve(value));
    }

    public static int solve(String value) {
        char[] array = value.toCharArray();
        int size = array.length;
        int start = 0;
        int end = size - 1;
        int count = 0;

        while (start < end) {
            if(array[start] == array[end]) {
                start++; // Move Pointer to Right
                end--; // Move Pointer to Left
            }
            else {
                count++; // Increment Count
                start = 0; // Reset Start Count
                end = size - count - 1; // Reset End Count With Subtracting Of Count
            }
        }

        return count;
    }
}
