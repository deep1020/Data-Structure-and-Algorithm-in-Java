package String;

import java.util.Arrays;

public class sort_characters {
    static String sortString(String str){
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="hello";
        System.out.println(sortString(str));
    }
}
