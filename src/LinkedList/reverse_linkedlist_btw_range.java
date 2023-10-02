package LinkedList;

public class reverse_linkedlist_btw_range {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        // Move pre to the node before the left position
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }

        ListNode curr = pre.next;

        // Reverse the nodes between left and right
        for (int i = left; i < right; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = pre.next;
            pre.next = nextNode;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        reverse_linkedlist_btw_range solution = new reverse_linkedlist_btw_range();
        ListNode reversed1 = solution.reverseBetween(head1, 2, 4);

        // Print the reversed list
        ListNode curr1 = reversed1;
        while (curr1 != null) {
            System.out.print(curr1.val + " ");
            curr1 = curr1.next;
        }
        System.out.println();

        // Test case 2: [5], left = 1, right = 1
        ListNode head2 = new ListNode(5);
        ListNode reversed2 = solution.reverseBetween(head2, 1, 1);

        // Print the reversed list
        ListNode curr2 = reversed2;
        while (curr2 != null) {
            System.out.print(curr2.val + " ");
            curr2 = curr2.next;
        }
        System.out.println();
    }
}