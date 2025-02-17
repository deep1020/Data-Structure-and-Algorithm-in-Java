package Dynamic_Programming.Edit_Distance;

public class delete_operation_for_two_strings {
    static int minDistance(String word1, String word2) {
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
        System.out.println(minDistance(word1,word2)); // Output: 2 -> 1st step to make "sea" to "ea", 2nd step to make "eat" to "ea"
    }
}
// T.C -> O(m*n)
// Outer loop runs m times (length of word1) and Inner loop runs n times (length of word2)
// S.C -> O(n)
// The code uses a single 1D array (dp) of size n+1 to store intermediate results
// Additionally, a temporary array (temp) of size n+1 is used during computation

// An array dp of size n+1 is used to store the LCS values for the previous row
// A temporary array temp is used to store the LCS values for the current row
// Outer Loop (i): Iterates through characters of word1
// Inner Loop (j): Iterates through characters of word2
// If the characters match (word1[i-1] == word2[j-1]), the LCS value is incremented by 1: temp[j]=1+dp[j-1]
// Otherwise, the LCS value is the maximum of the previous row or the previous column in the current row: temp[j]=max(dp[j],temp[j-1])
// At the end of each outer loop iteration, the dp array is updated to the values in temp
// Final LCS length is stored in dp[n]
// Number of deletions is computed as: Result=m+n-2*dp[n]

// Dry run: Input: word1 = "sea", word2 = "eat"
// Initialize dp as [0,0,0,0] (size n+1)
// Outer loop i=1 (character 's'):
// Inner loop j=1 (character 'e'): No match -> temp[1]=0
// j=2 (character 'a'): No match -> temp[2]=0
// j=3 (character 't'): No match -> temp[3]=0
// Update dp = [0,0,0,0]
// Outer loop i=2 (character 'e'):
// j=1 (character 'e'): Match -> temp[1] = 1
// j=2 (character 'a'): No match -> temp[2]=1
// j=3 (character 't'): No match -> temp[3]=1
// Update dp = [0,1,1,1]
// Outer loop i=3 (character 'a'):
// j=1 (character 'e'): No match -> temp[1]=1
// j=2 (character 'a'): Match -> temp[2]=2
// j=3 (character 't'): No match -> temp[3]=2
// Update dp = [0,1,2,2]
// Final LCS length= dp[3]= 2
// Deletion: m+n-2*dp[n]= 3+3-2*2= 2