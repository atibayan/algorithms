package countGoodNodesInBinaryTree;

import Trees.TreeNode;

public class Solution {
    public int goodNodes(TreeNode root) {

        // the following is if the root can be null
        // if (root == null) return 0;
        // return 1 + dfs(root.left, root.val) + dfs(root.right, root.val);

        return dfs(root, root.val);
    }

    public int dfs(TreeNode root, int max) {
        if (root == null) return 0;

        int includeCurr = 0;
        if(root.val >= max) includeCurr++;
        max = Math.max(root.val, max);
        return includeCurr + dfs(root.left, max) + dfs(root.right, max);
    }
}
