package Recursion;
// Divide and Conquer approach

public class power_logn_calculate {
    static int calcPower(int x,int n){
        if(n==0){  // base case 1
            return 1;
        }
        if(x==0){  // base case 2
            return 0;
        }
        int result=calcPower(x,n/2);
        if(n%2==0){
            return result*result;
        }
        else {
            return result*result*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
// T.C -> O(logn)
// S.C -> O(logn)
