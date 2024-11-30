package Strivers.recursion.Medium;

public class SubsequenceAPrint {
    public static void main(String args[]) {
        String s = "abc";
        String f = "";
        System.out.println("All possible subsequences are: ");
        solve(0, s, f);
    }

    static void solve(int index, String str, String temp) {
        if (index == str.length()) {
            if(!temp.isEmpty()) {
                System.out.println(temp);
            }
            else {
                System.out.println("{}");
            }
            return;
        }
        //picking
        //f = f + s.charAt(i);
        solve(index + 1, str,temp+str.charAt(index));

        //poping out while backtracking
        //f.pop_back();
        solve(index + 1, str, temp);
    }
}
