package HashSet;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicates_from_string {
    static String removeDuplicate(String str){
        char arr[]=str.toCharArray();
        String result="";
        Set<Character> set=new HashSet<>();
        for(char i:arr){
            if(!set.contains(i)){
                result+=i;
                set.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="bcabbccda";
        System.out.println(removeDuplicate(str));
    }
}
// T.C-> O(n)
// S.C-> O(n)
// sort and two pointer approach
