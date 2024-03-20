package LinkedList;

import java.util.LinkedList;



public class palindrome_linkedlist {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        LinkedList<Integer> vals = new LinkedList<>();
        ListNode curr = head;
        while (curr!=null) {
            vals.add(curr.val);
            curr = curr.next;
        }
        while (vals.size()>1) {
            if (vals.pollFirst()!=vals.pollLast()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
