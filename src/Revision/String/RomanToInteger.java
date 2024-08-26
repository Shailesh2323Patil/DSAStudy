package Revision.String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        String romanNumber = "IX";

        Integer size = romanNumber.length();
        Integer number = 0;

        for (int i = 0; i < size; i++) {
            if(i < size-1 && (hashMap.get(romanNumber.charAt(i)) < hashMap.get(romanNumber.charAt(i+1)))) {
                number -= hashMap.get(romanNumber.charAt(i));
            }
            else {
                number += hashMap.get(romanNumber.charAt(i));
            }
        }

        System.out.println("The Roman Number Of "+ romanNumber +" is "+number);

    }
}
