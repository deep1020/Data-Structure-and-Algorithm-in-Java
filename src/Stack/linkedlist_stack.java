package Stack;

public class linkedlist_stack {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head; // head of linkedlist and top of stack
        public static boolean isEmplty(){
            return head==null; // return true if head=null
        }
        public static void push(int data){  // push onto the head of linkedlist
            Node newNode=new Node(data);
            if(isEmplty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmplty()){  // if stack is empty it will return -1
                return -1;
            }
            int top=head.data;
            head=head.next; // next of head becomes head i.e top element will be removed
            return top;  // represent which node is removed from stack
        }
        public static int peek(){
            if(isEmplty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

//        Stack stk=new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);

        while(!Stack.isEmplty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }

    }
}
