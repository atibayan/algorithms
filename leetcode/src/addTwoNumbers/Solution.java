// leetcode 2
package addTwoNumbers;

import LinkedLists.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num1 = 0;
        int num2 = 0;
        int multiplier = 1;


        while(l1 != null) {
            num1 = l1.val * multiplier + num1;
            multiplier *= 10;
            l1 = l1.next;
        }

        multiplier = 1;

        while(l2 != null) {
            num2 = l2.val * multiplier + num2;
            multiplier *= 10;
            l2 = l2.next;
        }

        int sum = num1 + num2;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        do {
            int remainder = sum % 10;
            node.next = new ListNode(remainder);
            node = node.next;
            sum/=10;
        } while(sum > 0);

        return dummy.next;
    }
}
