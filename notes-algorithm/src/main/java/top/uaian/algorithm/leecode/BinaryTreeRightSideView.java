package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3, null, treeNode2);
        TreeNode treeNode4 = new TreeNode(2, null, treeNode1);
        TreeNode treeNode5 = new TreeNode(1, treeNode4, treeNode3);
        rightSideView(treeNode5);
    }


    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null)
            return list;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Stack<TreeNode> stack = new Stack<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                stack.push(poll);
                if(poll.left != null){
                    queue.add(poll.left);
                }
                if(poll.right != null){
                    queue.add(poll.right);
                }
            }
            list.add(stack.pop().val);
        }
        return list;
    }
}
