package Strivers.string.Easy;

public class Palindrome {
    public static void main(String[] args) {
        String value = "CBABC";

        System.out.println(value+" is Palindrome = "+isPalindrome(value));
    }

    /**
     * Two Pinter Approach
     * */
    public static boolean isPalindrome(String value) {
        int i = 0;
        int j = value.length() - 1;

        char[] array = value.toCharArray();

        while (i < j) {
            if(array[i] != array[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
