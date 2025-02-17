package Dynamic_Programming.Fibonacci_Sequence;
// 70. Climbing Stairs

public class Climbing_Stairs_bottom_up_approach {

    static int climbStairs(int n){
        if(n==0 || n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(climbStairs(n)); // Output: 5
    }
}
// T.C -> O(n)
// S.C -> O(n)

// You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Input: n = 4
// Output: 5
// Explanation: There are five ways to climb to the top.
// 1. 1 step + 1 step + 1 step + 1 step
// 2. 1 step + 1 steps + 2 steps
// 3. 1 step + 2 steps + 1 steps
// 4. 2 steps + 1 steps + 1 steps
// 5. 2 steps + 2 steps