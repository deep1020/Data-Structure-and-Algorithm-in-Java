package Dynamic_Programming.Knapsack_Problem;

// 518. Coin Change II
public class minimum_coin_change_2 {
    static int change(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
            for(int j=coin;j<=amount;j++){
                dp[j]+=dp[j-coin];
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=5;
        System.out.println(change(coins,amount));
    }
}
// T.C -> O(n*m) where n= number of coins and m= amount
// S.C -> O(m)

// 1) Initialization:
// Define a 1D dp array where dp[j] represents the number of ways to make the amount j using the given coins
// Initialize dp[0]=1 because there is exactly one way to make the amount 0 — by using no coins
// 2) Iterate through each coin:
// For every coin, update the dp array for amounts from the coin's value (coin) to the target amount
// For each j (current amount), update: dp[j] += dp[j - coin]
// The term dp[j - coin] represents the ways to make the amount j - coin. Adding this to dp[j] accounts for using the current coin
// 3) Return result:
// The value at dp[amount] represents the total number of combinations to make the target amount

// Processing Coin 1
// For j = 1 to 5:
// dp[j] += dp[j - 1]
// dp[1] = dp[1] + dp[0] = 0 + 1 = 1
// dp[2] = dp[2] + dp[1] = 0 + 1 = 1
// dp[3] = dp[3] + dp[2] = 0 + 1 = 1
// dp[4] = dp[4] + dp[3] = 0 + 1 = 1
// dp[5] = dp[5] + dp[4] = 0 + 1 = 1
// dp after processing coin 1:
// dp = [1, 1, 1, 1, 1, 1]

// Processing Coin 2
// For j = 2 to 5:
// dp[j] += dp[j - 2]
// dp[2] = dp[2] + dp[0] = 1 + 1 = 2
// dp[3] = dp[3] + dp[1] = 1 + 1 = 2
// dp[4] = dp[4] + dp[2] = 1 + 2 = 3
// dp[5] = dp[5] + dp[3] = 1 + 2 = 3
// dp after processing coin 2:
// dp = [1, 1, 2, 2, 3, 3]

// Processing Coin 5
// For j = 5:
// dp[5] += dp[5 - 5]
// dp[5] = dp[5] + dp[0] = 3 + 1 = 4
// dp after processing coin 5:
// dp = [1, 1, 2, 2, 3, 4]

// dp[5] = 4, so there are 4 ways to make the amount 5
