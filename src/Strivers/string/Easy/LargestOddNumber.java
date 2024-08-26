package Strivers.string.Easy;

public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "52";
        //String str = "35427";
        //String str = "354271111111111111111111111111110"; // If number is more than Long

        System.out.println("The Largest Odd Number of "+str+" is "+largestOddNumber(str));
    }

    private static String largestOddNumber(String str) {
        int n = str.length()-1;

        for(int i=n; i>=0; i--) {
            Integer num = Integer.parseInt(String.valueOf(str.charAt(i)));

            if(num % 2 == 1) {
                return str.substring(0, i+1);
            }
        }

        return "";
    }
}
