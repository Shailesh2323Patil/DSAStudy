package ShardhaDidi.array;

import java.util.Scanner;

/*
 * YouTube Link : https://www.youtube.com/watch?v=NTHVTY6w2Co&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=11
 * Notes : https://docs.google.com/document/d/1AJgDc-EdunSKVhW1fujsaZS5JfxSgzFiDlfg35ewhIA/edit
 * */
public class PrintArrayNamesFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String[] names = new String[size];

        for(int i=0; i < size; i++) {
            names[i] = sc.next();
        }

        for(int i=0; i < names.length; i++) {
            System.out.println("Names "+i+" "+names[i]);
        }
    }
}
