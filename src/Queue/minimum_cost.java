package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class minimum_cost {
    static int minimum(int arr[]){
        Queue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans=0;
        while (pq.size()>1){
            int first=pq.remove();
            int second=pq.remove();
            int sum=first+second;
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,8,6,9};
        System.out.println(minimum(arr));
    }
}
// T.C -> O(nlogn)
// S.C -> O(n)