package Dynamic_Programming.Fibonacci_Sequence;
// 746. Min Cost Climbing Stairs
public class min_cost_climbing_stairs_top_down {
    private static int[] dp;
    static int minCostClimbingStairs(int[] cost){
        int n=cost.length;
        dp=new int[n];
        return Math.min(minCostHelper(cost,n-1),minCostHelper(cost,n-2));
    }
    private static int minCostHelper(int[] cost,int n){
        if(n==0 || n==1){
            return cost[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=cost[n]+Math.min(minCostHelper(cost,n-1),minCostHelper(cost,n-2));
        return dp[n];
    }
    public static void main(String[] args) {
        int[] cost={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost)); // Output: 6
    }
}

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