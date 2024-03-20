package Queue;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class kth_smallest_element_queue {
    static int findKthSmallest(int nums[],int k){
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()>nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthSmallest(nums,k));
    }
}
// T.C -> O(nlogk)
// S.C -> O(k)
// Collections.reverseOrder() or (a,b)->b-a leads to MaxHeap where the largest elements come to the top.