package ShardhaDidi.sorting;

import java.util.Arrays;
public class C_InsertionSortString {

    public static void main(String[] args) {
        String[] words = {"DEL","POR","ABC","KLM"};

        for(int i=1; i<words.length; i++) {
            String current = words[i];

            int j = i-1;

            while(j>=0 && (current.compareTo(words[j]) < 0)) {
                words[j+1] = words[j];
                j--;
            }

            words[j+1] = current;
        }

        System.out.println(Arrays.toString(words));
    }

}
