package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * Place Heavy Object At the End
 * */
public class A_BubbleSortString {
    public static void main(String[] args) {
        String[] data = {"Abhi","Chinu","Bablu","Deepu","Elvise","Deenu"};

        String temp;

        for(int i=0; i<data.length; i++) {

            for(int j=0; j<data.length - 1 - i; j++) {

                if(data[j].compareTo(data[j+1]) > 0) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(data));
    }
}
