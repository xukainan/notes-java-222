package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2, treeNode1, null);
        TreeNode treeNode5 = new TreeNode(1, null, treeNode3);
        inorderTraversal(treeNode5);
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            list.add(pop.val);
            root = pop.right;
        }
        return list;
    }

//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if(root == null)
//            return list;
//        Recursive(root, list);
//        return list;
//    }
//
//    private static void Recursive(TreeNode curNode, List<Integer> list) {
//        if(curNode.left != null)
//            Recursive(curNode.left, list);
//        list.add(curNode.val);
//        if(curNode.right != null)
//            Recursive(curNode.right, list);
//    }
}
