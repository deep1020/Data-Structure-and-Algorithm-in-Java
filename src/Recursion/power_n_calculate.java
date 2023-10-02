package Recursion;

public class power_n_calculate {
    static int calcPower(int x,int n){
        if(n==0){  // base case 1
            return 1;
        }
        if(x==0){  // base case 2
            return 0;
        }
        int xPower=x*calcPower(x,n-1);
        return xPower;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
// T.C -> O(n)
// S.C -> O(n)
