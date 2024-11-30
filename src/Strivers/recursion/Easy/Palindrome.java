package Strivers.recursion.Easy;

public class Palindrome {
    public static void main(String[] args) {
        // Example string.
        String s = "madam";
        System.out.println(isPalindrome(0, s));
    }

    private static Boolean isPalindrome(int index, String str) {
        if(index > str.length() / 2) {
            return true;
        }

        if(str.charAt(index) != str.charAt(str.length() - index - 1)) {
            return false;
        }

        return isPalindrome(index+1, str);
    }
}
