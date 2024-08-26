package Strivers.string.Easy.SortCharactersByFrequency;

import java.util.*;

public class SortCharactersByFrequencyBrute {
    public static void main(String[] args) {
        String str = "Aabbcc";
        System.out.println(frequencySort(str));
    }

    private static String frequencySort(String str) {
        Map<Character, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Character>> treeMap = new TreeMap<>(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();

        for (char a : str.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!treeMap.containsKey(entry.getValue())) {
                treeMap.put(entry.getValue(), new ArrayList<>());
            }
            treeMap.get(entry.getValue()).add(entry.getKey());
        }

        for (Map.Entry<Integer, List<Character>> entry : treeMap.entrySet()) {
            int freq = entry.getKey();
            List<Character> chars = entry.getValue();
            for (char c : chars) {
                for (int i = 0; i < freq; i++) {
                    stringBuilder.append(c);
                }
            }
        }

        return stringBuilder.toString();
    }
}
