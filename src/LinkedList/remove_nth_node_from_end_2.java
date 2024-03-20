package LinkedList;
// Two pointer approach

public class remove_nth_node_from_end_2 {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static ListNode deleteNthNodeFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(-1);
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n=2;
        ListNode newHead=deleteNthNodeFromEnd(head,n);
        printLinkedList(newHead);
    }
}
