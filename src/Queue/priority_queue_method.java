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
// Priority Queue, by default implement min Priority Queue, If we need to change the order of Priority Queue from min to max Priority Queue, then we use some methods as follows:
// 1) Using default Comparator Collections.reverseOrder()
// PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

// 2) Using custom Comparator
//PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(
//        new Comparator<Integer>() {
//            // Compare method for place element in
//            // reverse order
//            public int compare(Integer a, Integer b)
//                if (a < b)
//                    return 1;
//                if (a > b)
//                    return -1;
//                return 0;
//            }
//        });

// 3) Using lambda expression
// PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((a, b) -> b - a);