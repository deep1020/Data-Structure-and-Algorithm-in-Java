package Queue;
import java.util.*;
// Being an interface the queue needs a concrete class for the declaration and the most common classes are
// PriorityQueue and LinkedList
public class queue_using_collections {

    public static void main(String[] args) {
        // Queue is an interface not a class. Object is created only for classes not an interface
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
