package HashMap;

import java.util.*;

public class count_frequency_character {

    static List<List<String>> countCharFreq(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            if(ch!=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        List<List<String>> resultList=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            List<String> tempList=new ArrayList<>();
            tempList.add(Character.toString(entry.getKey()));
            tempList.add(Integer.toString(entry.getValue()));
            resultList.add(tempList);
        }
        return resultList;
    }
    public static void main(String[] args) {
        String str="Hello java";
        List<List<String>> resultList=countCharFreq(str);
        System.out.println(resultList);
    }
}
// LinkedHashMap maintains the insertion order of the entries, which ensures that characters are processed in the order
// they first appear in the input string.