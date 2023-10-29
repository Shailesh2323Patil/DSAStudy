package Strivers.string.Easy.ReverseWord;

import java.util.Stack;

public class ReverseWordBruteForce {
    public static void main(String[] args) {
        //String str = "the sky is blue";
        //String str = "  hello world  ";
        String str = "a good   example";
        System.out.println("Before reversing words: ");
        System.out.println(str);

        System.out.println("Before reversing words: ");
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        Stack<String> stack = new Stack<>();

        String temp = "";

        // Remove Extra Space Before and After
        str = str.trim();

        int size = str.length();

        for(int i=0; i<size; i++) {
            if(str.charAt(i) == ' ') {
                // Remove Extra Space from in between Words
                if(str.charAt(i-1) == ' ') {
                    continue;
                }
                stack.push(temp);
                temp = "";
            }
            else {
                temp += str.charAt(i);
            }
        }

        stack.push(temp);

        String ans = "";

        while(stack.size() > 1) {
            ans += stack.peek() + " ";
            stack.pop();
        }

        ans += stack.peek();

        return ans;
    }
}
