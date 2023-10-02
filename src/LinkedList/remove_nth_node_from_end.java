package LinkedList;

public class remove_nth_node_from_end {

    Node head;
    public class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
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
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){  // currNode.next -> it doesn't print last node i.e 'a'
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("Null");  // last node points to Null
    }
    public static int size(Node head){
        Node curr=head;
        int size=0;
        while (curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    static Node delete_node(Node head,int n){
        int length=size(head);
        int indexTosearch = length-n;
        Node prev=head;
        int i=1;
        while (i<indexTosearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        remove_nth_node_from_end list = new remove_nth_node_from_end();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        delete_node(list.head, 2);
        list.printList();
    }
}
