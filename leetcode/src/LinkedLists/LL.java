package LinkedLists;

public class LL {
    public static ListNode arrayToList(int[] arr) {
        ListNode root = null;
        for(int i = 0; i < arr.length; i++) {
            root = insertNode(root, arr[i]);
        }
        return root;
    }

    public static ListNode insertNode(ListNode root, int i) {
        ListNode temp = new ListNode(i);

        if(root == null) return temp;

        ListNode last = root;
        while(last.next != null) {
            last = last.next;
        }

        last.next = temp;
        return root;
    }

    public static void displayList(ListNode root) {
        while(root != null) {
            System.out.print(root.val);
            if(root.next != null) System.out.print(", ");
            root = root.next;
        }
        System.out.println();
    }
}
