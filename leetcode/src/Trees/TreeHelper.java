package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHelper {

    public static TreeNode convertListToTree(int[] arr){

        if(arr == null || arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while(i < arr.length){
            TreeNode curr = q.remove();

            if(i < arr.length) {
                curr.left = new TreeNode(arr[i++]);
                q.add(curr.left);
            }
            if(i < arr.length) {
                curr.right = new TreeNode(arr[i++]);
                q.add(curr.right);
            }
        }

        return root;
    }


    public static void displayTree(TreeNode root) {
        if(root != null) {
            System.out.print(root.val + ", ");
            displayTree(root.left);
            displayTree(root.right);
        }
    }
}
