package Dynamic_Programming.Fibonacci_Sequence;

import java.util.Arrays;

public class fibonacci_top_down_approach {
    static int fibonacci(int n){
        int[] dp=new int[n+1]; // dp array to store computed Fibonacci numbers
        Arrays.fill(dp,-1); // Initialize all elements to -1 (uncomputed)
        return fibHelper(n,dp);
    }
    private static int fibHelper(int n,int[] dp){
        if(n<=1){ // Base cases: If n is 0 or 1
            return n;
        }
        if(dp[n]!=-1){
            return dp[n]; // Return if already computed
        }
        // Recursively compute and store the result in dp
        dp[n]=fibHelper(n-1,dp)+fibHelper(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=7; // 0 1 1 2 3 5 8 13
        System.out.println(fibonacci(n)); // Output: 13
    }
}
// T.C -> O(n)
// With memoization, Each Fibonacci number is calculated exactly once, leading to O(n) time.
// When the result of a subproblem is computed, it is stored in the dp array. On subsequent calls, the precomputed value is returned in O(1) time.
// S.C -> O(n)
// dp array has a size of n+1 to store fibonacci values, which requires O(n) space.
// Recursive stack space: The depth of the recursion stack corresponds to n since the recursion goes as deep as F(n), F(n-1), F(n-2), and so on.