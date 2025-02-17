package Dynamic_Programming.Longest_Common_Subsequence;
// Space Optimized Approach

public class Longest_Common_Subsequence_2 {
    static int longestCommonSubsequence(String text1,String text2){
        int m=text1.length();
        int n=text2.length();
        if(m==0 || n==0){
            return 0;
        }
        int[] dp=new int[n+1];
        for(int i=1;i<=m;i++){
            int prev=0;
            for(int j=1;j<=n;j++){
                int temp=dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[j]=prev+1;
                }
                else{
                    dp[j]=Math.max(dp[j],dp[j-1]);
                }
                prev=temp;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        String text1="abaaba";
        String text2="babbab";
        System.out.println(longestCommonSubsequence(text1,text2)); // Output: 4 => abab, baba
    }
}
// T.C -> O(m*n) where m= length of text1 and n= length of text2
// Nested loop runs m*n times
// S.C -> O(n)
// we use a 1D array dp of size n+1 to store the LCS lengths at each step