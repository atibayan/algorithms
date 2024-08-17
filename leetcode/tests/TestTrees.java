import Trees.TreeHelper;
import Trees.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
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
}
