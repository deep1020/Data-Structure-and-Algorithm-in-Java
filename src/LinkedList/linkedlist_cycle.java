package LinkedList;
import java.util.*;

public class linkedlist_cycle {
    static Node head;
    // Linked list Node
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static public void push(int new_data)
    {
        // 1 & 2: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);
        // 3. Make next of new Node as head
        new_node.next = head;
        // 4. Move the head to point to new Node
        head = new_node;
    }
    static boolean hasloop(Node head){
        HashSet<Node> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        linkedlist_cycle lc=new linkedlist_cycle();
        lc.push(10);
        lc.push(20);
        lc.push(30);
        lc.push(40); // 10->20->30->40
        lc.head.next.next=lc.head; // 30->10->20->30->10...
        if(hasloop(head)){
            System.out.println("Loop Found");
        }
        else {
            System.out.println("No Loop Found");
        }
    }
}
