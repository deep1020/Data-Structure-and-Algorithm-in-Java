package String;

import java.util.Arrays;

public class sort_by_character {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
        Arrays.sort(str);
        for(String i:str){
            System.out.print(i+" ");
        }
    }
}
