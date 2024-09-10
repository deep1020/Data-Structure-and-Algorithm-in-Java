package String;

public class isSubsetString {
    static public boolean isSubset(String str1,String str2){
        int charCount[]=new int[26];
        for(char ch:str2.toCharArray()){
            charCount[ch-'a']++;
        }
        for(char ch:str1.toCharArray()){
            if(charCount[ch-'a']>0){
                charCount[ch-'a']--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="code";
        String str2="cheetod";
        System.out.println(isSubset(str1,str2)); // true
    }
}
