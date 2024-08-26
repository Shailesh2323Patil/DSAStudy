package Strivers.string.Easy.CheckAnagrams;

import java.util.Arrays;

public class CheckAnagramsBetter {
    public static void main(String[] args) {
        String firstWord = "anagram";
        String secondWord = "nagaram";

        System.out.println("Check Anagrams : "+isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] arr = new int[26];

        for(int i=0; i<str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }

        for(int i=0; i<str2.length(); i++) {
            arr[str2.charAt(i) - 'a']--;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
