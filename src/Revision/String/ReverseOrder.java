package Revision.String;

import java.util.Stack;

public class ReverseOrder {
    public static void main(String[] args) {
        String str = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(str);

        Stack stack = new Stack();

        String temp = new String();

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(chars[i] == ' ') {
                stack.push(temp);
                temp = new String();
            }
            else {
                temp += chars[i];
            }
        }

        stack.push(temp);

        String answer = new String();
        while (stack.size() > 0) {
            answer += stack.pop()+" ";
        }

        System.out.println("After reversing words: ");
        System.out.println(answer);
    }
}
