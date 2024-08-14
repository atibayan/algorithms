package LinkedLists;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof ListNode))
            return false;
        ListNode nodeToCompare = (ListNode) obj;
        ListNode temp = this;

        while(nodeToCompare != null && temp != null) {
            if(nodeToCompare.val != temp.val) return false;
            nodeToCompare = nodeToCompare.next;
            temp = temp.next;
        }

        return nodeToCompare == null && temp == null;
    }
}
