package Dynamic_Programming.Palindromic_Subsequence;

public class minimum_insertion_steps_palindrome_string {
    static int minInsertions(String s) {
        int n=s.length();
        int[] dp=new int[n];
        for(int i=n-2;i>=0;i--){
            int prev=0;
            for(int j=i+1;j<n;j++){
                int temp=dp[j];
                if(s.charAt(i)==s.charAt(j)){
                    dp[j]=prev;
                }
                else{
                    dp[j]=Math.min(dp[j],dp[j-1])+1;
                }
                prev=temp;
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        String s="mbadm";
        System.out.println(minInsertions(s));
    }
}
// T.C -> O(n^2)
// Outer loop runs n times and inner loop runs n-i times, leading to O(n^2) time
// S.C -> O(n)
// Only 1D dp array is used: O(n)

// 1) Define DP Array:
// dp[j] stores the minimum number of insertions needed to make the substring s[i...j] a palindrome
// Instead of a 2D DP table, a single array is used for space optimization
// 2) Iterative Calculation:
// Traverse i from n-2 to 0 (bottom-up approach)
// For each i, traverse j from i+1 to n-1
// Use a rolling variable (prev) to store the value of dp[j-1] from the previous iteration, simulating a 2D table's diagonal access
// 3) Transition:
// If s.charAt(i) == s.charAt(j): No insertion is needed for the characters at i and j. Set dp[j] = prev
// If s.charAt(i) != s.charAt(j): Choose the minimum of:
// Adding a character to match s[i] (dp[j]),
// Adding a character to match s[j] (dp[j-1]). Add 1 to the result since one insertion is needed
// 4) Final result:
// After all iterations, dp[n-1] contains the result for the entire string

// Dry run: Input: s = "mbadm"
// n = 5 (length of the string).
// dp = [0, 0, 0, 0, 0] (1D array initialized to store the minimum insertions required for substrings).

// Step 1: i = 3
// We calculate for substrings starting from index 3:
// j = 4:
// Compare s[3] = 'd' and s[4] = 'm'. They are not equal.
// dp[4] = min(dp[4] (0), dp[3] (0)) + 1 = 1.
// Update prev = dp[4] = 0.
// Updated dp[]: [0, 0, 0, 0, 1].

// Step 2: i = 2
// We calculate for substrings starting from index 2:
// j = 3:
// Compare s[2] = 'a' and s[3] = 'd'. They are not equal.
// dp[3] = min(dp[3] (0), dp[2] (0)) + 1 = 1.
// Update prev = dp[3] = 0.
// j = 4:
// Compare s[2] = 'a' and s[4] = 'm'. They are not equal.
// dp[4] = min(dp[4] (1), dp[3] (1)) + 1 = 2.
// Update prev = dp[4] = 1.
// Updated dp[]: [0, 0, 0, 1, 2].

// Step 3: i = 1
// We calculate for substrings starting from index 1:
// j = 2:
// Compare s[1] = 'b' and s[2] = 'a'. They are not equal.
// dp[2] = min(dp[2] (0), dp[1] (0)) + 1 = 1.
// Update prev = dp[2] = 0.
// j = 3:
// Compare s[1] = 'b' and s[3] = 'd'. They are not equal.
// dp[3] = min(dp[3] (1), dp[2] (1)) + 1 = 2.
// Update prev = dp[3] = 1.
// j = 4:
// Compare s[1] = 'b' and s[4] = 'm'. They are not equal.
// dp[4] = min(dp[4] (2), dp[3] (2)) + 1 = 3.
// Update prev = dp[4] = 2.
// Updated dp[]: [0, 0, 1, 2, 3].

// Step 4: i = 0
// We calculate for substrings starting from index 0:
// j = 1:
// Compare s[0] = 'm' and s[1] = 'b'. They are not equal.
// dp[1] = min(dp[1] (0), dp[0] (0)) + 1 = 1.
// Update prev = dp[1] = 0.
// j = 2:
// Compare s[0] = 'm' and s[2] = 'a'. They are not equal.
// dp[2] = min(dp[2] (1), dp[1] (1)) + 1 = 2.
// Update prev = dp[2] = 1.
// j = 3:
// Compare s[0] = 'm' and s[3] = 'd'. They are not equal.
// dp[3] = min(dp[3] (2), dp[2] (2)) + 1 = 3.
// Update prev = dp[3] = 2.
// j = 4:
// Compare s[0] = 'm' and s[4] = 'm'. They are equal.
// dp[4] = prev (2).
// Update prev = dp[4] = 2.
// Updated dp[]: [0, 1, 2, 3, 2].

// After all iterations, the result is stored in dp[n-1], which is dp[4] = 2