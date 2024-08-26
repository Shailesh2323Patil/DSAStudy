package Strivers.string.Medium;

public class MyASCIIToInteger_Atoi {
    public static void main(String[] args) {
        //String s = "42";
        //String s = " -042";
        //String s = "1337c0d3";
        //String s = "0-1";
        //String s = "words and 987";
        String s = "+-12";

        System.out.println("The ATOI is " + myAtoi(s));
    }

//    private static int myAtoi(String s) {
//        long ans = 0;
//        int sign = 1;
//        int i = 0;
//
//        // Skip leading whitespace
//        while (i < s.length() && s.charAt(i) == ' ') {
//            i++;
//        }
//
//        // Check for sign
//        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
//            sign = (s.charAt(i) == '-') ? -1 : 1;
//            i++;
//        }
//
//        // Convert the digits to an integer
//        while (i < s.length() && Character.isDigit(s.charAt(i)))
//        {
//            ans = ans * 10 + (s.charAt(i) - '0');
//            if (ans * sign <= Integer.MIN_VALUE) {
//                return Integer.MIN_VALUE;
//            }
//            if (ans * sign >= Integer.MAX_VALUE) {
//                return Integer.MAX_VALUE;
//            }
//            i++;
//        }
//
//        return (int) ans * sign;
//    }

    private static int myAtoi(String s) {
        long ans = 0;
        int i = 0;
        int sign = 1;

        char[] charArray = s.toCharArray();
        int size = charArray.length;

        while(i<size && charArray[i] == ' ') {
            i++;
        }

        if(i<size && (charArray[i] == '-' || charArray[i] == '+')) {
            sign = (charArray[i] == '-') ? -1 : 1;
            i++;
        }

        while(i<size && Character.isDigit(charArray[i])) {
            ans = ans * 10 + (charArray[i] - '0');

            if(ans*sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            else if(ans*sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return ((int) ans * sign);
    }
}
