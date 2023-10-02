package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority_queue_method {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(14);
        pq.add(21);
        pq.add(11);
        pq.add(31);
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        System.out.println("Priority Queue content: "+pq);
        System.out.println("Head of Queue: "+pq.peek());
        System.out.println("Head removed: "+pq.poll());
        System.out.println("Priority Queue content: "+pq);
        Iterator<Integer> it= pq.iterator();
        while(it.hasNext()){
            System.out.println(pq.poll());
        }
    }
}
