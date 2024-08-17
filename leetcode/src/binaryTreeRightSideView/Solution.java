package binaryTreeRightSideView;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        if(root!=null) dq.addFirst(root);

        while(!dq.isEmpty()){
            result.add(dq.peekLast().val);
            for(int i = 0, len = dq.size(); i < len; i++){
                TreeNode curr = dq.poll();
                if(curr.left != null) dq.add(curr.left);
                if(curr.right != null) dq.add(curr.right);
            }
        }

        return result;
    }
}
