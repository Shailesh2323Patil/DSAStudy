package Strivers.string.Medium;

public class LongestPalindromicString {
    public static void main(String[] args) {
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();

        //String str = "babad";
        String str = "cbbd";

        System.out.println("Longest Palindromic String : ");
        System.out.println(longestPalindromicString.longestPalindrome(str));
    }

    private static int maxLength = 0;
    private static int start = 0;
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }

        for(int i=0; i<s.length(); i++) {
            expandString(s, i, i); // Check for odd-length palindrome
            expandString(s, i, i+1); // Check for even-length palindrome
        }

        return s.substring(start, start + maxLength);
    }

    public static void expandString(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int length = right - left - 1;
        if(length > maxLength) {
            maxLength = length;
            start = left + 1;
        }
    }
}