package Dynamic_Programming.Palindromic_Subsequence;

public class palindrome_substring {
    static int countSubstrings(String s) {
        if(s.length()==0){
            return 0;
        }
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int count=0;
        // Base case 1: Length=1 is always palindrome
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            count++;
        }
        // Base case 2: Length=2 is palindorme if two characters are equal i.e. char[i]==char[i+1]
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                count++;
            }
        }
        // General case: Length>2 palindrome if first and last characters are equal and middle string is palindrome
        for(int len=3;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j=i+len-1;
                dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="ababca";
        System.out.println(countSubstrings(s)); // Output: 8 -> "a","aa","aaa","aba","abba","b","bab","bb"
    }
}
// T.C -> O(n^2)
// Base case loop iterate O(n)
// General case loop iterates over all substring lengths and indices, resulting in O(n^2)
// S.C -> O(n^2)
// dp table of size n*n

// Dynamic Programming Approach:
// Initialize a 2D dp table to track palindromic substrings
// dp[i][j]: A boolean value indicating whether the substring s[i:j+1] is a palindrome
// Solve base cases (length = 1 and length = 2 substrings)
// Iterate for substrings of increasing lengths (len>2), using previous results to compute whether the substring is a palindrome

// Steps:
// Base Case 1: Single Character Substrings
// Every single character is a palindrome (dp[i][i]=true)
// Increment count for each single-character substring
// Base Case 2: Substrings of Length 2
// A substring of two characters (s[i:i+2]) is a palindrome if the two characters are the same (s[i] == s[i+1])
// Update dp[i][i+1] accordingly and increment count
// General Case: Substrings of Length>2
// A substring s[i:j] is a palindrome if:
// s[i]==s[j] (the first and last characters are equal)
// The substring s[i+1:j-1] is a palindrome (dp[i+1][j-1]=true)
// Update dp[i][j] based on the above condition and increment count if it's a palindrome
// Return result: count contains the total number of palindromic substrings

// Brute Force Approach (Time Limit Exceeded) O(n^3)

//static int countSubstrings(String s) {
//    int count=0;
//    for(int i=0;i<s.length();i++){
//        for(int j=i;j<s.length();j++){
//            if(isPalindrome(s,i,j)){
//                count++;
//            }
//        }
//    }
//    return count;
//}
//private static boolean isPalindrome(String s, int left, int right){
//    while(left<right){
//        if(s.charAt(left++)!=s.charAt(right--)){
//            return false;
//        }
//    }
//    return true;
//}