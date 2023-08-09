package Recursion;

import java.util.HashSet;

public class unique_subsequence_of_string {
    static String uniqueSubsequence(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
               return "";
            }
            else{
                set.add(newString);
                return newString+"\n";
            }
        }
        char currChar=str.charAt(idx);
        String seq1=uniqueSubsequence(str,idx+1,newString+currChar,set);
        String seq2=uniqueSubsequence(str,idx+1,newString,set);
        return seq1+seq2;
    }
    public static void main(String[] args) {
        String str="aaba";
        HashSet<String> set=new HashSet<>();
        System.out.println(uniqueSubsequence(str,0,"",set));
    }
}
// T.C -> O(2^n) considers all possible subsequences of the string and there are 2^n possible subsequences of a string of length n.
// S.C -> O(n) hash set can grow up to the size of the string.
