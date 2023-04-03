package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LowestCommonAncestorOfABinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(2, treeNode7, treeNode8);
        TreeNode treeNode4 = new TreeNode(5, treeNode5, treeNode6);
        TreeNode treeNode1 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(1, treeNode1, treeNode2);
        TreeNode root = new TreeNode(3, treeNode4, treeNode3);
        TreeNode treeNode = lowestCommonAncestor(root, treeNode4, treeNode8);
        System.out.println(treeNode.val);
    }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<Integer, TreeNode> cVal2PMap = new HashMap<>();
        Map<Integer, TreeNode> parentMapForP = new HashMap<>();

        listAllCVal2PNode(root, cVal2PMap);

        while (p != null){
            TreeNode tmpParentNode = cVal2PMap.get(p.val);
            parentMapForP.put(p.val, p);
            p = tmpParentNode;
        }

        while (q != null){
            if(parentMapForP.containsKey(q.val)){
                return parentMapForP.get(q.val);
            }
            TreeNode tmpParentNode = cVal2PMap.get(q.val);
            q = tmpParentNode;
        }
        return null;
    }

    private static void listAllCVal2PNode(TreeNode parentNode, Map<Integer, TreeNode> cVal2PMap) {
        if(parentNode.left != null){
            cVal2PMap.put(parentNode.left.val, parentNode);
            listAllCVal2PNode(parentNode.left, cVal2PMap);
        }

        if(parentNode.right != null){
            cVal2PMap.put(parentNode.right.val, parentNode);
            listAllCVal2PNode(parentNode.right, cVal2PMap);
        }
    }

}
