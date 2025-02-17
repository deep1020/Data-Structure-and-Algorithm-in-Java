package Dynamic_Programming.Palindromic_Subsequence;

public class longest_palindromic_subsequence {
    static int longestPalindromeSubseq(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int[][] dp=new int[n][n];
        for(int i=n-1;i>=0;i--){
            dp[i][i]=1; // Edge case: e.g. bafvgffab -> baffab (length=6) not bafab (length=5)
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    dp[i][j]=2;
                    if(i+1<j){
                        dp[i][j]+=dp[i+1][j-1];
                    }
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        String s="agbdba";
        System.out.println(longestPalindromeSubseq(s)); // Output: 5
    }
}
// T.C -> O(n^2)
// Two nested loops of dp array takes O(n^2) time
// S.C -> O(n^2)
// dp table requires O(n^2) space

// 1) Initialization:
// - arr: Converts the string s into a character array for easier manipulation
// - n: Stores the length of the string
// - dp[i][j]: A 2D array where dp[i][j] represents the length of the longest palindromic subsequence in the substring s[i...j]
// 2) Filling the dp table:
// - Outer Loop (i from n-1 to 0): Processes substrings starting from the end of the string to the beginning
// - Inner Loop (j from i+1 to n-1): Processes substrings starting at i and ending at j
// i) Characters Match (arr[i] == arr[j]):
// - If the characters at positions i and j are the same, they can be included in the palindromic subsequence
// - Add 2 to the length of the longest palindromic subsequence in the substring s[i+1...j-1]
// - Example: For substring "aba", if a == a, add 2 to the result of the middle substring b
// ii) Characters Do Not Match (arr[i] != arr[j]):
// - Take the maximum value between:
// The length of the longest palindromic subsequence in the substring s[i+1...j] (exclude the character s[i])
// The length of the longest palindromic subsequence in the substring s[i...j-1] (exclude the character s[j])
// 3) Return result:
// - The value in dp[0][n-1] gives the length of the longest palindromic subsequence for the entire string
