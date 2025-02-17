package Dynamic_Programming.Longest_Common_Subsequence;
// 583. Delete Operation for Two Strings

public class delete_operation_for_two_strings {
    static int minSteps(String word1,String word2){
        int m=word1.length();
        int n=word2.length();
        int[] dp=new int[n+1];
        for(int i=1;i<=m;i++){
            int[] temp=new int[n+1];
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    temp[j]=1+dp[j-1];
                }
                else{
                    temp[j]=Math.max(dp[j],temp[j-1]);
                }
            }
            dp=temp;
        }
        return m+n-(2*dp[n]);
    }
    public static void main(String[] args) {
        String word1="sea";
        String word2="eat";
        System.out.println(minSteps(word1,word2)); // 1st step to make "sea" to "ea", 2nd step to make "eat" to "ea"
    }
}
// T.C -> O(m*n)
// S.C -> O(n)

// An array dp of size n+1 is used to store the LCS values for the previous row
// A temporary array temp is used to store the LCS values for the current row
// Outer Loop (i): Iterates through characters of word1
// Inner Loop (j): Iterates through characters of word2
// If the characters match (word1[i-1] == word2[j-1]), the LCS value is incremented by 1: temp[j]=1+dp[j-1]
// Otherwise, the LCS value is the maximum of the previous row or the previous column in the current row: temp[j]=max(dp[j],temp[j-1])
// At the end of each outer loop iteration, the dp array is updated to the values in temp
// final LCS length is stored in dp[n]
// number of deletions is computed as: Result=m+n-2*dp[n]
