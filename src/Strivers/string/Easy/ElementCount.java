package Strivers.string.Easy;

import java.util.*;

public class ElementCount {
    public static void main(String[] args) {
        String str = "a,a,a,b,b,c,c,d,d,e,e";

        String[] strArray = str.split(",");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=0; i<strArray.length; i++)
        {
            if(hashMap.containsKey(strArray[i])) {
                Integer count = hashMap.get(strArray[i]);
                hashMap.put(strArray[i], ++count);
            }
            else {
                hashMap.put(strArray[i], 1);
            }
        }

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
