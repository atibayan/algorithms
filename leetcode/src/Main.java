import LinkedLists.LL;
import LinkedLists.ListNode;
//import reverseLinkedList.Solution;
//import mergeTwoSortedLists.Solution;
import reorderLists.Solution;

public class Main {
    public static void main(String[] args) {

        // ==================================
        //reverseLinkedList Leetcode 206
//        Solution solution = new Solution();
//        int[] arr = new int[]{1,2,3,5,6,7,8,9};
//        ListNode root = LL.arrayToList(arr);
//        root = solution.reverseList(root);
//        LL.displayList(root);

        // **********************************

        // ==================================
        //mergeTwoSortedLinkedLists
//        Solution solution = new Solution();
//        int[] arr1 = new int[]{1,2,4};
//        int[] arr2 = new int[]{1,3,5};
//        ListNode root1 = LL.arrayToList(arr1);
//        ListNode root2 = LL.arrayToList(arr2);
//
//        ListNode root = solution.mergeTwoLists(root1,root2);
//        LL.displayList(root);
        // **********************************

        // ==================================
        //reorderLists
        Solution solution = new Solution();
        int[] arr = new int[]{2,4,6,8,10};
        ListNode root = LL.arrayToList(arr);
        solution.reorderList(root);
        LL.displayList(root);

        // **********************************

    }
}