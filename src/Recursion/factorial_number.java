package Recursion;

public class factorial_number {
    static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_n=n*calcFactorial(n-1);
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcFactorial(n));
    }
}

//static void calcFactorial(int n,int fact_n){
//    if(n==1 || n==0){
//        System.out.println(fact_n);
//        return;
//    }
//    fact_n*=n;
//    calcFactorial(n-1,fact_n);
//}
//public static void main(String[] args) {
//    int n=5;
//    calcFactorial(n,1);
//}
