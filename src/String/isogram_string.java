package String;

// An Isogram is a word in which no letter occurs more than once

import java.util.Arrays;

public class isogram_string {
    static boolean is_isogram(String str){
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<str.length()-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="Alphabet";
        System.out.println(is_isogram(str1));
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)
