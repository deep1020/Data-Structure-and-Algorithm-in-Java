package Recursion;

public class print_numbers {
    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(5);
    }

}
