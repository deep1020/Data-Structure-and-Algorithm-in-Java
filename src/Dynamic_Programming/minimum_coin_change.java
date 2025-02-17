package Dynamic_Programming;
// 322. Coin Change
import java.util.Arrays;

public class minimum_coin_change {
    static int minCoins(int coins[],int amount){
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
        int coins[]={1,5,6,9};
        int amount=10;
        System.out.println(minCoins(coins,amount));
    }
}
// T.C -> O(amount * coins.length)