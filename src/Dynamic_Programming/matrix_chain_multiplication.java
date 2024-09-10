package Dynamic_Programming;

public class matrix_chain_multiplication {
    public static int matrixChainMultiply(int[] dimensions){
        int n=dimensions.length;
        int[][] dp=new int[n][n];
        // Initialize the dp array with 0s
        for (int i=0;i<n;i++) {
            dp[i][i]=0;
        }
        // Fill the dp array using dynamic programming
        for (int len=2;len<n;len++) {
            for (int i=1;i<n-len+1;i++) {
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for (int k=i;k<j;k++) {
                    int cost=dp[i][k] + dp[k+1][j] + dimensions[i-1]*dimensions[k]*dimensions[j];
                    if (cost<dp[i][j]) {
                        dp[i][j]=cost;
                    }
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int[] dimensions={5,4,6,2,7};
        System.out.println("Minimum scalar multiplications needed: "+matrixChainMultiply(dimensions));
    }
}
// T.C -> O(n^3)

// Matrix -> A1: 5*4, A2: 4*6, A3: 6*2, A4: 2*7