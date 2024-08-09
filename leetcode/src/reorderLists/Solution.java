//Leetcode 143
package reorderLists;

import LinkedLists.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;


        // get the middle of a linked list
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //End the original list mid way
        ListNode slowCopy = slow.next;
        slow.next = null;

        // invert the second half
        ListNode previous = null;
        while(slowCopy != null) {
            ListNode temp = slowCopy.next;
            slowCopy.next = previous;
            previous = slowCopy;
            slowCopy = temp;
        }

        // merge the 2 lists
        ListNode headptr = head;
        while(previous != null){
            ListNode tempHead = headptr.next;
            ListNode tempPrevious = previous.next;

            previous.next = tempHead;
            headptr.next = previous;

            headptr = tempHead;
            previous = tempPrevious;
        }

    }
}
