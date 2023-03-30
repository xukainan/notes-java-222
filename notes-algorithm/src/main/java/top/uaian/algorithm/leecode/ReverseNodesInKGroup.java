package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;
import top.uaian.utils.ListUtils;

public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        ListNode tail = new ListNode(3);
        ListNode listNode1 = new ListNode(2, tail);
        ListNode listNode2 = new ListNode(6, listNode1);
        ListNode listNode3 = new ListNode(9, listNode2);
        ListNode listNode4 = new ListNode(7, listNode3);
        ListNode listNode5 = new ListNode(3, listNode4);
        ListNode head = new ListNode(1, listNode5);
        reverseList(head, 2);
    }

    private static ListNode reverseList(ListNode head, int k) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode preNode = hair;
        int count = 0;
        ListNode curNode = hair;
        while (curNode.next != null){
            while (count < k){
                if(curNode.next == null){
                    return hair.next;
                }
                curNode = curNode.next;
                count++;
            }
            ListNode tmpHead = preNode.next;
            preNode.next = null;
            ListNode nextNode = curNode.next;
            curNode.next = null;
            ListUtils.reverseListToReturn(tmpHead, curNode);
            preNode.next = curNode;
            tmpHead.next = nextNode;
            preNode = tmpHead;
            curNode = tmpHead;
            count=0;
        }
        return hair.next;

    }
}
