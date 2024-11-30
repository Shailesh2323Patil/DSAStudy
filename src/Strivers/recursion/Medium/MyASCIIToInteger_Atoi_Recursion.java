package Strivers.recursion.Medium;

public class MyASCIIToInteger_Atoi_Recursion {
    public static void main(String[] args) {
        String s = "1234";

        int n = s.length()-1;

        System.out.println("The ATOI is " + myAtoiRecursive(s, n));
    }
    private static int myAtoiRecursive(String str, int index)
    {
        if(index < 0) {
            return 0;
        }

        char ch = str.charAt(index);

        if(!Character.isDigit(ch)) {
            return 0;
        }

        int data = ch - '0';

        int recursive = myAtoiRecursive(str, index-1);

        return data + recursive * 10;
    }
}
