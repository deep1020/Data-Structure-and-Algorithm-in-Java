package Dynamic_Programming;

public class nth_fibonacci {
//    static int nthFibonacci(int n){
//        if(n<=1){
//            return n;
//        }
//        int curr=0;
//        int prev1=1;
//        int prev2=0;
//        for(int i=2;i<=n;i++){
//            curr=prev1+prev2;
//            prev2=prev1;
//            prev1=curr;
//        }
//        return curr;
//    }

    static int nthFibonacci(int n){
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

//    static int nthFibonacci(int n){
//        if(n<=1){
//            return n;
//        }
//        return nthFibonacci(n-1)+nthFibonacci(n-2);
//    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(nthFibonacci(n));
    }
}
// Fibonacci Series: 0 1 1 2 3 5 8 13 21
// Find out 6th index in fibonacci series which is 8

// Dynamic Programming - Bottom Up Approach
// T.C -> O(n) loop runs from 2 to n, performing a constant amount of work per iteration
// S.C -> O(n) due to the use of an extra array to store Fibonacci numbers up to n

// Space Optimized Approach
// T.C -> O(n) loop runs from 2 to n, performing constant time operations in each iteration
// S.C -> O(1) Only a constant amount of extra space is used to store the current and two previous Fibonacci numbers

// Recursion (Brute Force) Approach
// T.C -> O(2^n)
// S.C -> O(n) due to recursion stack