package LinkedList;

import java.util.List;

public class intersection_node {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    static ListNode getIntersection(ListNode headA,ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=(a==null)?headB:a.next;
            b=(b==null)?headA:b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        ListNode headA=new ListNode(4);
        headA.next=new ListNode(1);
        ListNode intersection = new ListNode(8);
        headA.next.next=intersection;
        intersection.next=new ListNode(4);
        intersection.next.next=new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);

        headB.next.next.next = intersection;
//        headB.next.next.next.next = new ListNode(4);
//        headB.next.next.next.next = new ListNode(5);

        ListNode result=getIntersection(headA,headB);
        if(result!=null){
            System.out.println("Intersection node value: "+result.val);
        }
        else{
            System.out.println("No intersection");
        }

    }
}
