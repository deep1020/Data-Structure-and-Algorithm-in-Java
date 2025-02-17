package Backtracking;

import java.util.*;

public class permutation_string {
    static List<String> printPermutations(String str){
        List<String> result=new ArrayList<>();
        generatePermutations(str,"",result);
        return result;
    }
    static void generatePermutations(String str,String perm,List<String> result){
        if(str.length()==0){
            result.add(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            generatePermutations(newStr,perm+currChar,result);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        System.out.println(printPermutations(str));
    }
}
// T.C -> O(n*n!) perform n! operations (since there are n! permutations for n numbers) and for each operation,
// we spend O(n) time for slicing the list in our recursive call.
// S.C -> O(n*n!) In the worst case, if we have 'n' distinct numbers, there would be n! permutations. Each permutation is a list of 'n' numbers.


//static void printPermutation(String str,String perm,int idx){
//    if(str.length()==0){
//        System.out.println(perm);
//        return;
//    }
//    for(int i=0;i<str.length();i++){
//        char currChar=str.charAt(i);
//        String newStr=str.substring(0,i)+str.substring(i+1);
//        printPermutation(newStr,perm+currChar,idx+1);
//    }
//}
//public static void main(String[] args) {
//    String str="ABC";
//    printPermutation(str,"",0);
//}