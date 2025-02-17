package Queue;
// It uses a resizable array to store its elements in addition to the implementation of the Deque interface.
// Also known as Array Double Ended Queue
// This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
// ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue,
// making it a good choice for scenarios where you need to perform many add and remove operations.
// ArrayDeque class is likely to be faster than Stack when used as a stack.
// ArrayDeque class is likely to be faster than LinkedList when used as a queue.

// Disadvantages:
// - Not synchronized: By default, the ArrayDeque class is not synchronized, which means that multiple threads can access it simultaneously,
// leading to potential data corruption.
// - Limited capacity: Although the ArrayDeque class uses a resizable array to store its elements, it still has a limited capacity,
// which means that you may need to create a new ArrayDeque when the old one reaches its maximum size.

import java.util.*;

public class ArrayDeque_methods {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(3);
        deque.addFirst(1);
        deque.addLast(2);

        System.out.println("Head element using element(): "+deque.element());
        System.out.println("Head element using getFirst(): "+deque.getFirst());
        System.out.println("Last element using getLast(): "+deque.getLast());

        // push(): push element onto the top of the deque
        deque.push(6);
        deque.push(8);
        // toArray(): Returns an array containing all elements in sequence (from first to the last element)
        Object[] arr=deque.toArray();
        System.out.println("Array Elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(""+arr[i]);
        }
        // peek(): return head element without removing it
        System.out.println("Head element using peek(): "+deque.peek());
        // peekLast(): return last element without removing it
        System.out.println("Last element using peek(): "+deque.peekLast());
        System.out.println("Remove First: "+deque.removeFirst()+"\n"+"Remove Last: "+deque.removeLast());
        // contains(): check whether a specific element is present in the Deque or not
        System.out.println(deque.contains(2)); // 2 is not exist as it was removed using deque.removeLast()
        // pop(): element is popped from the top of the deque
        System.out.println("Popped element: "+deque.pop());
        System.out.println("Deque after operation: "+deque);
    }
}
