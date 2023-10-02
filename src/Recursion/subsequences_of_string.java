package Recursion;

public class subsequences_of_string {
    static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        // choose to add currChar
        subsequences(str,idx+1,newString+currChar);
        // choose to not add currChar
        subsequences(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str,0,"");
    }
}
// T.C -> O(2^n)
// S.C -> O(n)

// Base case for the recursion is when idx is equal to the length of the input string str.
// This means we have processed all the characters, and the newString contains a complete subsequence.
// At this point, the method prints the newString, representing one of the subsequences generated, and
// returns to continue the recursion from the previous call.

// In each recursive call, the method chooses whether to include the character at the current index idx
// (represented by currChar) in the newString or not

//subsequences("abc", 0, "") -> Current index (idx) is 0, newString is "", calls:
//subsequences("abc", 1, "a") -> Current index (idx) is 1, newString is "a", calls:
//subsequences("abc", 2, "ab") -> Current index (idx) is 2, newString is "ab", calls:
//subsequences("abc", 3, "abc") -> Current index (idx) is 3, newString is "abc", prints "abc"
//subsequences("abc", 3, "ab") -> Current index (idx) is 3, newString is "ab", prints "ab"
//subsequences("abc", 2, "a") -> Current index (idx) is 2, newString is "a", calls:
//subsequences("abc", 3, "ac") -> Current index (idx) is 3, newString is "ac", prints "ac"
//subsequences("abc", 3, "a") -> Current index (idx) is 3, newString is "a", prints "a"
//subsequences("abc", 1, "") -> Current index (idx) is 1, newString is "", calls:
//subsequences("abc", 2, "b") -> Current index (idx) is 2, newString is "b", calls:
//subsequences("abc", 3, "bc") -> Current index (idx) is 3, newString is "bc", prints "bc"
//subsequences("abc", 3, "b") -> Current index (idx) is 3, newString is "b", prints "b"
//subsequences("abc", 2, "") -> Current index (idx) is 2, newString is "", calls:
//subsequences("abc", 3, "c") -> Current index (idx) is 3, newString is "c", prints "c"
//subsequences("abc", 3, "") -> Current index (idx) is 3, newString is "", prints ""
