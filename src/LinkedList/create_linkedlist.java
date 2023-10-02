package LinkedList;
public class create_linkedlist {
    Node head;
    private int size;
    create_linkedlist(){
        this.size=0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null; // next of a new node is null. At start, it creates only single node not a list
            size++;
        }
    }

    // Insert operation - at first position
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
//            return;
        }
        // if list already exist, next of newNode points to head and then newNode will become head
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert operation - at last position
    public void addLast(String data){
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
        Node currNode=head;
        while(currNode!=null){  // currNode.next -> it doesn't print last node i.e 'a'
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");  // last node points to Null

    }

    // Delete operation - at first position
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // Delete operation - at last position
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--; // wrote here because we miss if(head.next==null) condition otherwise.
        //  If there is single head we don't need size--

        // If only one node in linkedlist, head assign to null
        if(head.next==null){
            head=null;
            return;
        }
        // if list already exist, traverse linkedlist
        Node secondLast=head;
        Node lastNode=head.next; // if head.next=null -> lastnode=null
        while(lastNode.next!=null){ // null.next gives error
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        create_linkedlist list = new create_linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of linkedlist: "+list.getSize());
    }
}
