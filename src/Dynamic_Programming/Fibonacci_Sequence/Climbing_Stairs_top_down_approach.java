package Dynamic_Programming.Fibonacci_Sequence;
// 70. Climbing Stairs

import java.util.HashMap;
import java.util.Map;

public class Climbing_Stairs_top_down_approach {
    static int climbStairs(int n) {
        Map<Integer,Integer> dp=new HashMap<>();
        return climbHelper(n,dp);
    }
    private static int climbHelper(int n, Map<Integer,Integer> dp){
        if (n==0 || n==1) {
            return 1;
        }
        if(!dp.containsKey(n)){
            dp.put(n,climbHelper(n-1,dp)+climbHelper(n-2,dp));
        }
        return dp.get(n);
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
