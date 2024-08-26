package Revision.String;

public class MinimumCharRequiredToPalindrome {
    public static void main(String[] args) {
        String value = "ACECAAA";

        System.out.println("The Character Required To Make String Palindrome "+makePalindrome(value));
    }

    public static Integer makePalindrome(String str) {
        Integer start = 0;
        Integer end = str.length()-1;
        Integer count = 0;

        while (start < end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else {
                count++;
                start = 0;
                end = str.length() - count - 1;
            }
        }

        return count;
    }
}
