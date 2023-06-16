package String;

import java.util.Arrays;

public class longest_common_prefix {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        System.out.println(lcp(strs));
    }
    public static String lcp(String strs[]){
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        // compare both strings character by character
        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return index==0?"":str1.substring(0,index);
    }
}
