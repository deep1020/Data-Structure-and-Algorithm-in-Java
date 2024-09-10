package String;

import java.util.ArrayList;
import java.util.List;

public class count_frequency_character {

    static List<List<String>> countCharFreq(String str){
        int count[]=new int[26];
        List<List<String>> resultList=new ArrayList<>();
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                count[ch-'a']++;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                List<String> tempList=new ArrayList<>();
                tempList.add(Character.toString(i+'a'));
                tempList.add(Integer.toString(count[i]));
                resultList.add(tempList);
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        String str="hello java";
        List<List<String>> list=countCharFreq(str);
        System.out.println(list);
    }
}
