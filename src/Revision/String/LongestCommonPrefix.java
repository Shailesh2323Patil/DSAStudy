package Revision.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};

        System.out.println("Common Prefix : "+longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strings) {
        Arrays.sort(strings);

        String s1 = strings[0];
        String s2 = strings[strings.length - 1];
        String filter = new String();

        int index = 0;
        while (index < s2.length()) {
            if(s1.charAt(index) != s2.charAt(index)) {
                break;
            }

            filter += s1.charAt(index);
            index++;
        }

        return filter;
    }
}
