package Dynamic_Programming;

public class knapsack_problem {
    public static int knapsack(int values[],int weights[],int capacity){
        int dp[][]=new int[values.length+1][capacity+1];
        for(int i=1;i<=values.length;i++){
            for(int j=1;j<=capacity;j++){
                if(weights[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weights[i-1]]+values[i-1]);
                }
            }
        }
        return dp[values.length][capacity];
    }
    public static void main(String[] args) {
        int values[]={6,11,1,12,19,12};
        int weights[]={1,2,4,4,6,7};
        int capacity=8;
        System.out.println(knapsack(values,weights,capacity));
    }
}
