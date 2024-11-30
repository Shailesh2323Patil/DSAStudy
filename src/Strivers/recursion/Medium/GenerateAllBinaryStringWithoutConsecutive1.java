package Strivers.recursion.Medium;

public class GenerateAllBinaryStringWithoutConsecutive1 {
    public static void main(String args[]) {
        int k = 3;
        //Calling function fun with argument k
        fun(k);
    }

    // Array conversion to String--
    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    static void fun(int n) {
        if (n <= 0) {
            return;
        }

        char[] ch = new char[n];

        // Initializing first character to Zero
        ch[0] = '0';
        // Generating Strings starting with Zero--
        generate(n, ch, 1);

        // Initialized first Character to one--
        ch[0] = '1';
        generate(n, ch, 1);
    }

    static void generate(int n, char[] ch, int index) {
        // Base Condition when we
        // reached at the end of Array**
        if (index == n) {
            // Printing the Generated String**
            // Return to the previous case*
            System.out.println(toString(ch)+" ");
            return;
        }

        // If the first Character is
        //Zero then adding**
        if (ch[index - 1] == '0') {
            ch[index] = '0';
            generate(n, ch, index + 1);
            ch[index] = '1';
            generate(n, ch, index + 1);
        }

        // If the Character is One
        // then add Zero to next**
        if (ch[index - 1] == '1') {
            ch[index] = '0';
            // Calling Recursively for the
            // next value of Array
            generate(n, ch, index + 1);
        }
    }
}
