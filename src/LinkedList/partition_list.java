package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class partition_list {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    static ListNode partition(ListNode head,int x){
        if(head==null || head.next==null){
            return head;
        }
        ListNode leftHead=new ListNode(0);
        ListNode rightHead=new ListNode(0);
        ListNode low=leftHead;
        ListNode high=rightHead;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                low.next=curr;
                low=curr;
            }
            else{
                high.next=curr;
                high=curr;
            }
            curr=curr.next;
        }
        low.next=rightHead.next;
        high.next=null;
        return leftHead.next;
    }
    static List<Integer> printList(ListNode head){
        List<Integer> result=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            result.add(curr.val);
            curr=curr.next;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,2};
        int x=3;
        ListNode head=new ListNode(arr[0]);
        ListNode curr=head;
        for(int i=1;i<arr.length;i++){
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
        }
        ListNode result=partition(head,x);
        System.out.println("Partition List: "+printList(result));
    }
}
