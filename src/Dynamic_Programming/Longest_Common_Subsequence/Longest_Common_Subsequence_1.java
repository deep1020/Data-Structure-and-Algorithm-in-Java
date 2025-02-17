package Dynamic_Programming.Longest_Common_Subsequence;

public class Longest_Common_Subsequence_1 {
    static int longestCommonSubsequence(String text1,String text2){
        int m=text1.length();
        int n=text2.length();
        if(m==0 || n==0){
            return 0;
        }
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String text1="abaaba";
        String text2="babbab";
        System.out.println(longestCommonSubsequence(text1,text2)); // Output: 4 => abab, baba
    }
}
// T.C -> O(m*n) where m= length of text1 and n= length of text2
// Nested loop runs m*n times
// S.C -> O(m*n)
// we use a 2D array dp of size (m+1)*(n+1) to store the LCS lengths at each step