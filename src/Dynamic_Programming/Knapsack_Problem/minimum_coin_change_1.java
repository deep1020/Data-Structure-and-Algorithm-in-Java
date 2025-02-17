package Dynamic_Programming.Knapsack_Problem;

import java.util.Arrays;

public class minimum_coin_change_1 {
    static int minCoinChange(int[] coins,int amount){
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(coin<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        return dp[amount]>amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins={1,5,6,9};
        int amount=10;
        System.out.println(minCoinChange(coins,amount));
    }
}
// T.C -> O(m*n) where m=amount, n=coins.length
// S.C -> O(m)
