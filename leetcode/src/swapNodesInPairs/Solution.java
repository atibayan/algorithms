// Leetcode 24
package swapNodesInPairs;

import LinkedLists.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head; // 0 or 1 nodes return

        ListNode first = head;
        ListNode second = head.next;
        ListNode secondCopy = head.next;
        ListNode previousLast = null;

        while(first != null && second != null) {

            ListNode tmp = second.next;
            second.next = first;
            first.next = tmp;

            if(previousLast!= null) previousLast.next = second;
            previousLast = first;

            first = tmp;
            if(first != null) second = first.next;

        }

        return secondCopy;
    }
}
