package Strivers.stack.Easy;

import java.util.Stack;

public class CheckedForBalancedParentheses {
    public static void main(String[] args) {
        String s="()[{}()]";
        if(isValid(s)==true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (Character it : str.toCharArray()) {
            if(it == '{' || it == '(' || it == '[') {
                stack.push(it);
            }
            else {
                if(stack.empty()) {
                    return false;
                }
                Character last = stack.pop();

                if( it == '}' && last == '{'
                    || it == ')' && last == '('
                    || it == ']' && last == '[')
                {
                    continue;
                }

                return false;
            }
        }

        return stack.empty();
    }
}
