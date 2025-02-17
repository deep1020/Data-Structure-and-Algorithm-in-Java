package Dynamic_Programming.Fibonacci_Sequence;
// 746. Min Cost Climbing Stairs
public class min_cost_climbing_stairs_bottom_up {
    static int minCostClimbingStairs(int[] cost){
        int n=cost.length;
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
            dp[i]=Math.min((cost[i-1]+dp[i-1]),(cost[i-2]+dp[i-2]));
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] cost={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost)); // Output: 6
    }
}
// T.C -> O(n)
// Loop iterates O(n) times and each iteration performs O(1) to find minCost
// S.C -> O(n)
// array minCost requires O(n) space

//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//You can either start from the step with index 0, or the step with index 1.
//Return the minimum cost to reach the top of the floor.

//Input: cost = [1,100,1,1,1,100,1,1,100,1]
//Output: 6
//Explanation: You will start at index 0.
// Pay 1 and climb two steps to reach index 2.
// Pay 1 and climb two steps to reach index 4.
// Pay 1 and climb two steps to reach index 6.
// Pay 1 and climb one step to reach index 7.
// Pay 1 and climb two steps to reach index 9.
// Pay 1 and climb one step to reach the top.
//The total cost is 6.

// Steps:
// Create a DP array minCost of size (n+1) to store the minimum cost for each step
// Iterate from step 2 to step n
// At each step, calculate the minimum cost by comparing the two possible paths to reach that step
// minCost[n] gives the minimum cost to climb beyond the last step (the top)