package HashMap;

import java.util.HashMap;
// An Isogram is a string in which no letter occurs more than once
public class isogram_string {

    static boolean checkIsogram(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        // toCharArray() -> converts the given string into a sequence of characters
        // Returned array length is equal to the length of the string.
        for (char c:word.toCharArray()) {
            char lower=Character.toLowerCase(c);
            map.put(lower,map.getOrDefault(lower,0)+1);
            if (map.get(lower)>1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "Alphabet";
        boolean isIsogram = checkIsogram(word);
        System.out.println("Is the word '" + word + "' an isogram? " + isIsogram);
    }
}