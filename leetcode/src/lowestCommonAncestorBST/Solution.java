package lowestCommonAncestorBST;

import Trees.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // recursion
        // if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        // else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        // else return root;

        // TC: O(logn)
        // SC: O(1)
        while(true){
            if(p.val < root.val && q.val < root.val) root = root.left;
            else if (p.val > root.val && q.val > root.val) root = root.right;
            else return root;
        }
    }
}