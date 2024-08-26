package Strivers.recursion.Easy;

public class Palindrome {
    public static void main(String[] args) {
        // Example string.
        String s = "madam";
        System.out.println(palindrome(0,s));
    }

    public static Boolean palindrome(int i, String str) {
        if(i > str.length() / 2) {
            return true;
        }

        if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
        return palindrome(i+1, str);
    }
}
