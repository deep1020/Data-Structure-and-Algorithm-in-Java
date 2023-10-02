package Queue;

import java.util.Stack;

public class queue_using_two_stacks {
    static class Queue{
        static Stack<Integer> st1=new Stack<>();
        static Stack<Integer> st2=new Stack<>();
        public static boolean isEmp(){
            return st1.isEmpty() && st2.isEmpty();
        }
        public static void add(int data){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(data);
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        public static int remove(){
            if(isEmp()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return st1.pop();
        }
        public static int peek(){
            if(isEmp()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return st1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmp()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
