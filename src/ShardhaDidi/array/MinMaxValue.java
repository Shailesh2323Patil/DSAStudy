package ShardhaDidi.array;

import java.util.Scanner;

/*
 * YouTube Link : https://www.youtube.com/watch?v=NTHVTY6w2Co&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=11
 * Notes : https://docs.google.com/document/d/1AJgDc-EdunSKVhW1fujsaZS5JfxSgzFiDlfg35ewhIA/edit
 * */
public class MinMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println("Enter Size : "+size);

        int[] numbers = new int[size];

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            else if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min Number "+min);
        System.out.println("Max Number "+max);
    }
}
