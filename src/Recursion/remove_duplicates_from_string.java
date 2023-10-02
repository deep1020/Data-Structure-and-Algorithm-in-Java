package Recursion;

public class remove_duplicates_from_string {
//    public static String removeDuplicate(String str) {
//        if (str == null || str.length() <= 1) {
//            return str; // No duplicates to remove
//        }
//        return removeDuplicateRecursively(str.toCharArray(), 0, "");
//    }
    private static String removeDuplicateRecursively(char[] arr, int idx, String newStirng) {
        if (idx == arr.length) {
            return newStirng;
        }
        char currentChar = arr[idx];
        // Check if the current character is not already present in the result string
        if (newStirng.indexOf(currentChar) == -1) { // Not present
            newStirng += currentChar;
        }
        return removeDuplicateRecursively(arr, idx + 1, newStirng);
    }
    public static void main(String[] args) {
        String str = "bcabbccda";
        System.out.println(removeDuplicateRecursively(str.toCharArray(),0,""));
    }
}
// T.C -> O(n)
// S.C -> O(n)

//static boolean[] map=new boolean[26];
//static void removeDuplicate(String str,int idx){
//    if(idx==str.length()){
//        return;
//    }
//    char currChar=str.charAt(idx);
//    if(map[currChar-'a']==false) {
//        System.out.print(currChar);
//        map[currChar-'a']=true;
//    }
//    removeDuplicate(str,idx+1);
//}
//public static void main(String[] args) {
//    String str="bcabbccda";
//    removeDuplicate(str,0);  // bcad
//}
// check map index i.e currChar of string - 'a' true/false. suppose currChar='c' so 'c'-'a'=2

//static void removeDuplicate(String str,int idx, String newString){
//    if(idx==str.length()){
//        System.out.println(newString);
//        return;
//    }
//    char currChar=str.charAt(idx);
//    if(map[currChar-'a']==true) {
//        removeDuplicate(str,idx+1,newString);
//    }
//    else {
//        newString+=currChar;
//        map[currChar-'a']=true;
//        removeDuplicate(str,idx+1,newString);
//    }
//}