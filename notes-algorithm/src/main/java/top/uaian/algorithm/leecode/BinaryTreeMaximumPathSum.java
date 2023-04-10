package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

public class BinaryTreeMaximumPathSum {

    private static Integer sum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
        TreeNode treeNode4 = new TreeNode(9);
        TreeNode treeNode5 = new TreeNode(-10, treeNode4, treeNode3);
        maxPathSum(treeNode5);
    }

    public static int maxPathSum(TreeNode root) {
        int backStackSum = Recursive(root);
        return sum;
    }

    private static int Recursive(TreeNode curNode) {
        if(curNode == null)
            return 0;

        int leftSum = Math.max(Recursive(curNode.left), 0);
        int rightSum = Math.max(Recursive(curNode.right), 0);

        int curSum = leftSum + rightSum + curNode.val;

        sum = Math.max(curSum, sum);

        return Math.max(leftSum, rightSum) + curNode.val;
    }
}
