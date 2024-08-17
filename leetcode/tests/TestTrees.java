import Trees.TreeHelper;
import Trees.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrees {

    @Test
    public void binaryTreeRightSideView(){
        binaryTreeRightSideView.Solution solution = new binaryTreeRightSideView.Solution();

        List<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 1,3,7);

        int[] arr = new int[]{1,2,3,4,5,6,7};
        TreeNode root = TreeHelper.convertListToTree(arr);
        Assert.assertEquals(solution.rightSideView(root), expected);
    }

    @Test
    public void countGoodNodesInBinaryTree(){
        countGoodNodesInBinaryTree.Solution solution = new countGoodNodesInBinaryTree.Solution();

        int[] arr = new int[]{1,2,-1,3,4};
        TreeNode root = TreeHelper.convertListToTree(arr);
        Assert.assertEquals(solution.goodNodes(root), 4);
    }

    @Test
    public void lowestCommonAncestorBST(){

        lowestCommonAncestorBST.Solution solution = new lowestCommonAncestorBST.Solution();

        //[6,2,8,0,4,7,9,null,null,3,5] p=2 q=8
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9))
        );

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        Assert.assertEquals(solution.lowestCommonAncestor(root, p, q).val, 6);
    }
}
