import reverseLinkedList.LL;
import reverseLinkedList.ListNode;
import reverseLinkedList.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,5,6,7,8,9};
        ListNode root = LL.arrayToList(arr);
        root = solution.reverseList(root);
        LL.displayList(root);
    }
}