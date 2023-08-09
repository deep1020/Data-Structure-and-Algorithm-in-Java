package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation_string {
    static void printPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            // "abc" -> choose a ->"bc"/ choose b->"ac"/ choose c->"ab"
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutation(str,"");
    }
}
// T.C -> O(n^2)
// S.C -> O(n)
// choices for every level: n*(n-1)*(n-2) so totol permutation= n!

// we are not passing index bcoz we are checking all chars iterating over loop at one place and
// to send next level, we don't track through index. we remove character
// suppose string="abc", currChar='b'
// str.substring(0,i)->'a' and str.substring(i+1)->'c' so newString="ac"


//static List<String> printPermutation(String str){
//    List<String> permutation=new ArrayList<>();
//    if(str.length()==0){
//        permutation.add("");
//        return permutation;
//    }
//    for(int i=0;i<str.length();i++){
//        char currChar=str.charAt(i);
//        // "abc" -> choose a ->"bc"/ choose b->"ac"/ choose c->"ab"
//        String newStr=str.substring(0,i)+str.substring(i+1);
//        List<String> subPermutation=printPermutation(newStr);
//        for(String subPerm:subPermutation){
//            permutation.add(currChar+subPerm);
//        }
//    }
//    return permutation;
//}
//public static void main(String[] args) {
//    String str="abc";
//    List<String> subPermutation=printPermutation(str);
//    for(String print_perm:subPermutation){
//        System.out.println(print_perm);
//    }
//}