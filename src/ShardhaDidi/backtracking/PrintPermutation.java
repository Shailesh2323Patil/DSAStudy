package ShardhaDidi.backtracking;

/*
 * YouTube Link : https://www.youtube.com/watch?v=bRs6E_SL2Tk&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=21
 * Notes : https://docs.google.com/document/d/1YcccD6X67qPPy6EzMbU-IG1GXj6JOKma9mMPVd1JuJM/edit
 *
 * */
public class PrintPermutation {
    public static void printPermutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr1 = str.substring(0, i);
            String newStr2 = str.substring(i + 1);

            String newStr = newStr1 + newStr2;
            printPermutation(newStr, perm + currChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, "");
    }
}
