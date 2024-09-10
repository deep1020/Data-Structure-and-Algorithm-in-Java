package StringBuilder;

import java.util.HashMap;
import java.util.Map;

public class count_frequency_character {
    static String countCharacterFrequency(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabcbabbc";
        System.out.println(countCharacterFrequency(str));
    }
}
// Output: a3b4c2
