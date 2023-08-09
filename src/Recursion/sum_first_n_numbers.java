package Recursion;

public class sum_first_n_numbers {
    static int printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            return sum;
        }
        sum+=i;
        int result=printSum(i+1,n,sum);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(printSum(1,5,0));
    }
}

//static void printSum(int i,int n,int sum){
//    if(i==n){
//        sum+=i;
//        System.out.println("Sum of first "+n+" numbers is "+sum);
//        return;
//    }
//    sum+=i;
//    printSum(i+1,n,sum);
//    System.out.println(i);
//}
//public static void main(String[] args) {
//    printSum(1,5,0);
//}
