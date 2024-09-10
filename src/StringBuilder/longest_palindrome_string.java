package StringBuilder;

import java.util.HashMap;
import java.util.Map;

public class longest_palindrome_string {
    static String longestPalindrome(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder leftHalf=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char ch=entry.getKey();
            int count=entry.getValue();
            // If the count is even, use all characters
            if(count%2==0){
                for(int i=0;i<count/2;i++){
                    leftHalf.append(ch);
                }
            }
            else{
                // If the count is odd, use the maximum possible even part
                for(int i=0;i<count/2;i++){
                    leftHalf.append(ch);
                }
                // Keep one character for the middle part if no middle character assigned yet
                if(middle.length()==0){
                    middle.append(ch);
                }
            }
        }
        // Construct palindrome
        StringBuilder rightHalf=new StringBuilder(leftHalf).reverse();
        return leftHalf.toString()+middle.toString()+rightHalf.toString();
    }
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
// abccccdd
// (a,1),(b,1),(c,4),(d,2)
// dccaccd or ccdadcc

// 1) Initialization and Frequency Counting
// Use HashMap to keep track of the frequency of each character in the string s
// for loop iterates over each character in the string and updates the countMap with the count of each character
// 2) Building the Palindrome:
// Two StringBuilder objects, leftHalf and middle, are initialized to build the parts of the palindrome
// for loop iterates over each entry in the map to determine how to distribute the characters:
// - If the frequency of a character is even, half of them are appended to leftHalf
// - If the frequency of a character is odd, the maximum possible even part (i.e., half of the count) is appended to leftHalf, and
// one character is reserved for the middle part if no middle character has been assigned yet
// 3) Constructing the Final Palindrome:
// A new StringBuilder named rightHalf is created by reversing the leftHalf
// The final palindrome is constructed by concatenating leftHalf, middle, and rightHalf