package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class count_words {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. "+"Have a good visit. have fun!";
        Map<String,Integer> map = new HashMap<>();
        String words[] = text.split("[\\s+\\p{P}]");
        for(int i=0;i<words.length;i++){
            String key = words[i].toLowerCase();
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                int value=map.get(key);
                value++;
                map.put(key,value);
            }
        }
        map.forEach((k,v) -> System.out.println(k+ " \t " +v));
    }
}
