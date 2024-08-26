package Strivers.string.Easy.CheckWhetherOneStringIsARotationOfAnother;

import java.util.Arrays;

public class RotateStringBruteForce {
    public static void main(String[] args) {
//        String str = "abcde";
//        String goal = "cdeab";

//        String str = "abcde";
//        String goal = "abced";

        String str = "xjab";
        String goal = "abcd";

        System.out.println(rotateString(str, goal));
    }

    private static boolean rotateString(String str, String goal) {
        if(str.length() != goal.length()) {
            return false;
        }

        char a1[] = str.toCharArray();
        Arrays.sort(a1);

        char a2[] = goal.toCharArray();
        Arrays.sort(a2);

        if(!new String(a1).equals(new String(a2))) {
            return false;
        }

        int size = str.length();
        int x = 0;

        while(x < size) {
            String s1 = str.substring(x, size);
            String s2 = goal.substring(0,size-x);

            if(s1.equals(s2)) {
                return true;
            }
            x++;
        }

        return false;
    }
}
