package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * Place Smallest Word At First
 * */
public class SortingStringArray {
    public static void main(String[] args) {
        String[] strArray = {"Elvise","Abhi","Chinu","Bablu","Deepu","Deenu"};

        for(int i = 0; i < strArray.length; i++)
        {
            for(int j = i+1; j < strArray.length; j++)
            {
                if(strArray[i].compareTo(strArray[j]) > 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(strArray));
    }
}
