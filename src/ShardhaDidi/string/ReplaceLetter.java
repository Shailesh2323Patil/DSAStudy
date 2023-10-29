package ShardhaDidi.string;

import java.util.Scanner;

/*
* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
* Example :
* original = “eabcdef’ ; result = “iabcdif”
* Original = “xyz” ; result = “xyz”
* */
public class ReplaceLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your String : ");
        String str = scanner.next();

        String result = new String();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += "i";
            }
            else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
