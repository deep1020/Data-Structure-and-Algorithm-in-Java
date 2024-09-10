package Greedy;

import java.util.PriorityQueue;

public class optimal_merge_pattern {
    static int minComputations(int size,int files[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<size;i++){
            pq.add(files[i]);
        }
        int count=0;
        while (pq.size()>1){
            int temp=pq.poll()+pq.poll();
            count+=temp;
            pq.add(temp);
        }
        return count;
    }
    public static void main(String[] args) {
        int size=5;
        int files[]={20,30,10,5,30};
        System.out.println(minComputations(size,files));
    }
}
// T.C -> O(nlogn)
// S.C -> O(n)