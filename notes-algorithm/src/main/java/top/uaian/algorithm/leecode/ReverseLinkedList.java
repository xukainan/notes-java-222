package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;
import top.uaian.utils.ListUtils;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode tail = new ListNode(3);
        ListNode listNode1 = new ListNode(2, tail);
        ListNode listNode2 = new ListNode(6, listNode1);
        ListNode listNode3 = new ListNode(9, listNode2);
        ListNode head = new ListNode(1, listNode3);
        reverseList(head);
        System.out.println(head);
    }


    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode perNode = null;
        while (curNode != null){
            ListNode nextNode = curNode.next;
            curNode.next = perNode;
            perNode = curNode;
            curNode = nextNode;
        }
        return perNode;
    }

}
