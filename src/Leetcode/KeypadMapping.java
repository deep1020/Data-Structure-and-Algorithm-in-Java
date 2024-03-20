package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class KeypadMapping {
    public static void main(String[] args) {
        KeypadMapping solution = new KeypadMapping();

        // Example 1
        String word1 = "abcde";
        System.out.println(solution.minimumPushes(word1)); // Output: 5

        // Example 2
        String word2 = "xycdefghij";
        System.out.println(solution.minimumPushes(word2)); // Output: 12
    }

    public int minimumPushes(String word) {
        // Define the mappings of letters to keys on a telephone keypad
        Map<Character, Integer> letterToKeyMapping = new HashMap<>();
        letterToKeyMapping.put('a', 2);
        letterToKeyMapping.put('b', 3);
        letterToKeyMapping.put('c', 4);
        letterToKeyMapping.put('d', 5);
        letterToKeyMapping.put('e', 6);
        letterToKeyMapping.put('f', 7);
        letterToKeyMapping.put('g', 8);
        letterToKeyMapping.put('h', 9);
        letterToKeyMapping.put('i', 10);
        letterToKeyMapping.put('j', 11);
        // Add additional mappings as needed

        int totalPushes = 0;

        for (char ch : word.toCharArray()) {
            Integer key=letterToKeyMapping.get(ch);
            if(key==null){
                continue;
            }
            // int key = map.get(ch);
            totalPushes += key % 10;
            totalPushes += (key / 10) - 1;
        }

        return totalPushes;
    }
}
