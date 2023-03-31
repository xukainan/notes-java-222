package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
        TreeNode treeNode4 = new TreeNode(9);
        TreeNode treeNode5 = new TreeNode(3, treeNode4, treeNode3);
        levelOrder(treeNode5);

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left != null)
                    queue.add(poll.left);
                if(poll.right != null)
                    queue.add(poll.right);
            }
            lists.add(list);
        }

        return lists;
    }
}
