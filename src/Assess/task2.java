package Assess;

import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static boolean solution(int[] A, int K) {
        int n=A.length;
        if(n<K)
            return false;
        for(int i=0;i<n-1;i++){
            if(A[i]+1<A[i+1])
                return false;
        }
        if(A[0]!=1 && A[n-1]!=K)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        int A[]={1,1,2,3,3};
        int K=3;
        int[] A2 = {1, 7, 3};
        int K2 = 2;
        System.out.println(solution(A,K));
        System.out.println(solution(A2,K2));
    }
}
