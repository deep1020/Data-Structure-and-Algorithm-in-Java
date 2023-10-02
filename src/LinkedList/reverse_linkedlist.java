package LinkedList;

public class reverse_linkedlist {
    Node head;

    private int size;
    reverse_linkedlist(){
        this.size=0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null; // next of a new node is null. At start, it creates only single node not a list
            size++;
        }
    }
    // Insert operation - at last position
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        // if list already exist, traverse linkedlist
        Node currNode=head;
        while(currNode.next!=null){ // until we get null after last node
            currNode=currNode.next; // Now next of currNode assign to currNode i.e currNode move to next node
        }
        // Now we reach last node,
        currNode.next=newNode; // next of currNode assign to newNode that we want to add at last
    }
    // print list
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        reverse_linkedlist.Node currNode=head;
        while(currNode!=null){  // currNode.next -> it doesn't print last node i.e 'a'
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");  // last node points to Null
    }
    public int getSize(){
        return size;
    }

    // Iterative method to reverse LinkedList
    public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;
        if(head==null || head.next==null){
            return;
        }
        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        reverse_linkedlist rev_list = new reverse_linkedlist();
        rev_list.addLast(1);
        rev_list.addLast(2);
        rev_list.addLast(3);
        rev_list.printList();

        rev_list.reverseIterate();
        rev_list.printList();
    }
}
