package ShardhaDidi.string;

import java.util.Scanner;

/*
* Take an array of Strings input from the user & find the cumulative (combined)
* length of all those strings.
* */
public class LengthOfStringFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] strArray = new String[size];

        int toLength = 0;

        for(int i=0; i < size; i++) {
            strArray[i] = scanner.next();
            toLength += strArray[i].length();
        }

        System.out.println(toLength);
    }
}
