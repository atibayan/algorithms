// Leetcode 19
package removeNthNodeFromEndOfList;

import LinkedLists.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // you have to put a dummy incase the linked list is sized 1
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(n > 0) {
            fast = fast.next;
            n--;
        }


        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;

        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
