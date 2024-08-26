package Revision.String;

public class Palindrome {
    public static void main(String[] args) {
        //String str = "ABCBA";
        String str = "ABCA";

        System.out.println("Check the "+str+" is Palindrome "+checkStringIsPalindrome(str));
    }

    public static Boolean checkStringIsPalindrome(String str) {
        Integer i = 0;
        Integer j = str.length()-1;

        while (i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
