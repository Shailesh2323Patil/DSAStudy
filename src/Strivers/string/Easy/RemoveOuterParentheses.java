package Strivers.string.Easy;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String str = "()()";

        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String s) {
        String[] chars = s.split("");
        int cnt = 0;

        for(int i=0; i<chars.length; i++) {
            if(chars[i].equals("(") && cnt == 0) {
                cnt++;
                chars[i] = "";
            }
            else if(chars[i].equals("(")) {
                cnt++;
            }
            else if(chars[i].equals(")") && cnt == 1) {
                cnt--;
                chars[i] = "";
            }
            else if(chars[i].equals(")")) {
                cnt--;
            }
        }

        return String.join("", chars);
    }
}
