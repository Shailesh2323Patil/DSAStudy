package Strivers.string.Easy.ReverseWord;

public class ReverseWordOptimalApproach {
    public static void main(String[] args) {
        //String str = "the sky is blue";
        //String str = "  hello world  ";
        //String str = "a good   example";
        String str = "EPY2giL";
        System.out.println("Before reversing words: ");
        System.out.println(str);

        System.out.println("Before reversing words: ");
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        s = s.trim();

        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        while(left <= right) {
            char ch = s.charAt(left);

            if(ch != ' ') {
                temp += ch;
            }
            else {
                if(!ans.equals("")) {
                    if(s.charAt(left - 1) == ' ') {
                        left++;
                        continue;
                    }
                    ans = temp+ " " + ans;
                }
                else {
                    ans = temp;
                }
                temp = "";
            }

            left++;
        }

        ans = temp + " " + ans;

        ans = ans.trim();

        return ans;
    }
}
