package Dynamic_Programming.Edit_Distance;

public class edit_distance {
    static int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){ // Base case: j=0 when word2 is empty
            dp[i][0]=i;
        }
        for(int j=1;j<=n;j++){ // Base case: i=0 when word1 is empty
            dp[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String word1="horse";
        String word2="ros";
        System.out.println(minDistance(word1,word2));
    }
}

// T.C -> O(m*n) where m= length of word1 and n= length of word2
// DP table has m+1 rows and n+1 columns
// Filling each cell takes constant time (O(1)), and there are m*n cells to fill. So overall time complexity is O(m*n)
// S.C -> O(m*n)
// DP table uses O(m*n) space since we need to store values for each pair of substrings of word1 and word2

// Approach: Dynamic Programming helps to solve this by breaking the problem into smaller subproblems
// create a 2D DP array dp[m+1][n+1] where m= length of word1 and n= length of word2
// The element dp[i][j] represents the minimum number of operations needed to convert the first i characters of word1 into the first j characters of word2
// When i = 0 (i.e., word1 is empty), we need to insert j characters to make it equal to the first j characters of word2. Therefore, dp[0][j] = j
// Similarly, when j = 0 (i.e., word2 is empty), we need to delete i characters to convert word1 into an empty string. Thus, dp[i][0] = i
// Filling the DP Table:
// we fill the DP table for all other values of i and j
// If the characters word1[i-1] and word2[j-1] are equal, no operation is required for this pair, so we simply take the value from dp[i-1][j-1]
// If the characters are not equal, we need to choose the minimum cost among three operations:
// 1) Replace: If we replace word1[i-1] with word2[j-1], the cost is dp[i-1][j-1] + 1
// 2) Delete: If we delete the current character of word1, the cost is dp[i-1][j] + 1
// 3) Insert: If we insert the current character of word2 into word1, the cost is dp[i][j-1] + 1
// Here 1 is added to the minimum value to account for the current cell itself.
// The value dp[m][n] contains the minimum number of operations needed to convert word1 into word2