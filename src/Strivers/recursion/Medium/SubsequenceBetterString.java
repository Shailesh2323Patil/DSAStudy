package Strivers.recursion.Medium;

import java.util.HashSet;

public class SubsequenceBetterString {

    /** GFG
     * Given a pair of strings of equal lengths, Geek wants to find the better string.
     * The better string is the string having more number of distinct subsequences.
     * If both the strings have equal count of distinct subsequence then return str1.
     * */
    public static void main(String[] args) {
        String str1 = "gfg";
        String str2 = "ggg";

//        String str1 = "a";
//        String str2 = "b";

        System.out.println("The Better String is = "+betterString(str1, str2));
    }

    public static String betterString(String str1, String str2) {
        // Code here
        HashSet hashSet = subsequenceCount(str1, 0, str1.length(), "", new HashSet<String>());
        HashSet hashSet2 = subsequenceCount(str2, 0, str2.length(), "", new HashSet<String>());

        System.out.println("The Distinct Subsequence of "+str1+" "+hashSet);
        System.out.println("The Distinct Subsequence of "+str2+" "+hashSet2);

        if(hashSet.size() > hashSet2.size()) {
            return str1;
        }
        else if(hashSet2.size() > hashSet.size()){
            return str2;
        }

        return str1;
    }

    private static HashSet subsequenceCount(String str, int index, int n, String s, HashSet<String> set) {
        if(index == n) {
            set.add(s);
            return set;
        }

        // Picking the Next Element
        // s + str.charAt(index)
        subsequenceCount(str, index+1, n, s + str.charAt(index), set);

        // Not Picking the Next Element
        // Passing only s
        subsequenceCount(str, index+1, n, s, set);

        return set;
    }
}
