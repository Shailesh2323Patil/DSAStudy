package Strivers.string.Easy;

import java.util.*;
public class CheckAnagrams {
    public static void main(String[] args) {
        String firstWord = "anagram";
        String secondWord = "nagaram";

        System.out.println("Check Anagrams : "+isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String s, String t) {
        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        s = new String(firstArray);
        t = new String(secondArray);

        if(s.equals(t)) {
            return true;
        }
        return false;
    }
}
