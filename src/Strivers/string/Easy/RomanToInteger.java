package Strivers.string.Easy;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String value = "III";
        //String value = "LVIII";
        //String value = "MCMXCIV";

        System.out.println("Roman to Integer Of "+value+" = "+romanToInt(value));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int size = s.length();

        Integer number = 0;

        for(int i=0; i<size; i++) {
            if(i < size-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                number -= map.get(s.charAt(i));
            }
            else {
                number += map.get(s.charAt(i));
            }
        }

        return number;
    }
}
