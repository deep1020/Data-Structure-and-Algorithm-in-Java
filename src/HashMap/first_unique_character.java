package HashMap;

import java.util.HashMap;
import java.util.Map;

public class first_unique_character {
    static int firstUniqChar(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="intellij";
        System.out.println(firstUniqChar(str));
    }
}
