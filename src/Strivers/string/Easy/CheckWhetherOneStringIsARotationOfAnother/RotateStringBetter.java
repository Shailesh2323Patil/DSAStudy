package Strivers.string.Easy.CheckWhetherOneStringIsARotationOfAnother;

public class RotateStringBetter {
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
        if (str.length() != goal.length()) {
            return false;
        }

        Boolean value = (str + str).contains(goal);

        return value;
    }
}
