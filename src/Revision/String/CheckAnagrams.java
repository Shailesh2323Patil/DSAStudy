package Revision.String;

import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {
        //String firstWord = "anagram";
        //String secondWord = "nagaram";

        String firstWord = "car";
        String secondWord = "rat";

        System.out.println("Check Anagrams : "+isAnagram(firstWord, secondWord));
    }

    public static Boolean isAnagram(String firstWord, String secondWord) {
        char[] firstArray = firstWord.toCharArray();
        char[] secondArray = secondWord.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        firstWord = new String(firstArray);
        secondWord = new String(secondArray);

        if(firstWord.equals(secondWord)) {
            return true;
        }

        return false;
    }
}
