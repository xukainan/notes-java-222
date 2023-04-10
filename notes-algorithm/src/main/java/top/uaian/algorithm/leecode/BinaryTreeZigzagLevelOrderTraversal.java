package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(9, null, null);
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
        TreeNode root = new TreeNode(3, treeNode4, treeNode3);
        List<List<Integer>> lists = zigzagLevelOrder(root);
        System.out.println(lists);
    }


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> lists = new ArrayList<>();
      if(root == null)
          return lists;
      Queue<TreeNode> queue = new ArrayDeque<>();
      queue.add(root);
      boolean isLeft = true;
      int size = 1;
      while (!queue.isEmpty()){
          Deque<Integer> deque = new LinkedList<>();
          for (int i = 0; i < size; i++) {
              TreeNode poll = queue.poll();
              if(isLeft){
                  deque.addLast(poll.val);
              }else {
                  deque.addFirst(poll.val);
              }
              if(poll.left != null)
                  queue.add(poll.left);
              if(poll.right != null)
                  queue.add(poll.right);
          }
          isLeft = !isLeft;
          size = queue.size();
          lists.add(new LinkedList(deque));
      }
      return lists;
    }
}
