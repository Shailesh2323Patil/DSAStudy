package Strivers.string.Easy;

public class MaximumNestingDepthOfParenthesis {
    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";
        System.out.println("The Maximum Depth = "+maxDepth(input));
    }

    private static int maxDepth(String s) {
        int max = 0;
        int cnt = 0;

        for(Character chr: s.toCharArray()) {
            if(chr == '(') {
                cnt++;
                max = Math.max(max, cnt);
            }
            else if(chr == ')') {
                cnt--;
            }
        }

        return max;
    }
}
