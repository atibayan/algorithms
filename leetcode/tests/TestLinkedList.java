import LinkedLists.LL;
import LinkedLists.ListNode;
import org.junit.Assert;
import org.junit.Test;
import swapNodesInPairs.Solution;
public class TestLinkedList {

    @Test
    public void addTwoNumbers() {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};
        ListNode root1 = LL.arrayToList(arr1);
        ListNode root2 = LL.arrayToList(arr2);
        ListNode expected = new ListNode(5, new ListNode(7, new ListNode(9)));

        addTwoNumbers.Solution solution = new addTwoNumbers.Solution();
        Assert.assertEquals(solution.addTwoNumbers(root1, root2),expected);
    }
    @Test
    public void mergeTwoSortedLinkedLists() {
        mergeTwoSortedLists.Solution solution = new mergeTwoSortedLists.Solution();
        int[] arr1 = new int[]{1,2,4};
        int[] arr2 = new int[]{1,3,5};
        ListNode root1 = LL.arrayToList(arr1);
        ListNode root2 = LL.arrayToList(arr2);

        ListNode root = solution.mergeTwoLists(root1,root2);

        int[] expArr = new int[]{1,1,2,3,4,5};
        ListNode expected = LL.arrayToList(expArr);

        Assert.assertEquals(root, expected);
    }
    @Test
    public void removeNthNodeFromEndOfList() {
        removeNthNodeFromEndOfList.Solution solution = new removeNthNodeFromEndOfList.Solution();
        int[] arr = new int[]{2,4,6,8,10};
        ListNode root = LL.arrayToList(arr);
        root = solution.removeNthFromEnd(root, 2);

        int[] expArr = new int[]{2,4,6,10};
        ListNode expected = LL.arrayToList(expArr);

        Assert.assertEquals(root, expected);
    }
    @Test
    public void reorderLists() {
        reorderLists.Solution solution = new reorderLists.Solution();
        int[] arr = new int[]{2,4,6,8,10,12};
        ListNode root = LL.arrayToList(arr);
        solution.reorderList(root);

        int[] expArr = new int[]{2,12,4,10,6,8};
        ListNode expected = LL.arrayToList(expArr);

        Assert.assertEquals(root, expected);
    }
    @Test
    public void reverseLinkedList() {
        reverseLinkedList.Solution solution = new reverseLinkedList.Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        ListNode root = LL.arrayToList(arr);
        root = solution.reverseList(root);

        int[] expArr = new int[]{9,8,7,6,5,4,3,2,1};
        ListNode expected = LL.arrayToList(expArr);

        Assert.assertEquals(root, expected);
    }
    @Test
    public void swapNodesInPairs() {
        swapNodesInPairs.Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6};
        ListNode root = LL.arrayToList(arr);
        root = solution.swapPairs(root);

        int[] expArr = new int[]{2,1,4,3,6,5};
        ListNode expected = LL.arrayToList(expArr);

        Assert.assertEquals(root, expected);
    }
}
