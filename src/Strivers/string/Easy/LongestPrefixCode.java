package Strivers.string.Easy;

import java.util.Arrays;

public class LongestPrefixCode {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};

        System.out.println("Common Prefix : "+longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strings) {
        Arrays.sort(strings);

        String s1 = strings[0];
        String s2 = strings[strings.length - 1];

        int index = 0;

        while (index < s1.length() && index < s2.length()) {
            if(s1.charAt(index) != s2.charAt(index)) {
                break;
            }
            index++;
        }

        return s1.substring(0, index);
    }
}
