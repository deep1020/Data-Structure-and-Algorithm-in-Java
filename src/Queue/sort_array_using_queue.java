package Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class sort_array_using_queue {
    static void sortArray(int nums[]){
        Queue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pq.remove();
        }
    }
    public static void main(String[] args) {
        int nums[]={5,2,3,1};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
// T.C -> O(nlogn)
// S.C -> O(n)

//        int n=0;
//        while(!pq.isEmpty()){
//            nums[n++]=pq.remove();
//        }