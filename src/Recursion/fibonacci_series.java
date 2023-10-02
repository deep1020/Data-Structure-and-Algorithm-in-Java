package Recursion;

public class fibonacci_series {
    static int printFibonacci(int n){
        if(n<=1){
            return n;
        }
        int result=printFibonacci(n-2)+printFibonacci(n-1);
        return result;
    }
    public static void main(String[] args) {
        int a=0,b=1;
        int n=7;
        for(int i=0;i<n;i++){
            System.out.println(printFibonacci(i));
        }
    }
}
// T.C -> O(2*n^2)
// S.C -> O(n)

//static void printFibonacci(int a,int b, int n){
//    if(n==0){
//        return;
//    }
//    int c=a+b;
//    System.out.println(c);
//    printFibonacci(b,c,n-1);
//}
//public static void main(String[] args) {
//    int a=0,b=1;
//    System.out.println(a);
//    System.out.println(b);
//    int n=7;
//    printFibonacci(a,b,n-2);
//}