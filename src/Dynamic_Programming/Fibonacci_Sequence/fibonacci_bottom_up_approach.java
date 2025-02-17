package Dynamic_Programming.Fibonacci_Sequence;

public class fibonacci_bottom_up_approach {
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(fibonacci(n));
    }
}
// T.C -> O(n)
// S.C -> O(n)