package Queue;

import java.util.PriorityQueue;

public class queue_method {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(22);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}

// add(element): Add element to rear if queue is not full. If queue is full -> throw exception
// offer(element): Add element to rear if queue is not full. If queue is not full -> return false
// remove(): Remove and return element at front. If queue is empty -> throw exception
// poll(): Remove and return element at front. If queue is empty -> return null
// element(): Return element at front of queue without removing it. If queue is empty -> throw exception
// peek(): Return element at front of queue without removing it. If queue is empty -> return null