package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode listNode1 = new ListNode(4, tail);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode head = new ListNode(1, listNode3);
        removeNthFromEnd(head, 2);
        System.out.println(head);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode first = hair, second = head;
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        while (second != null){
            second = second.next;
            first = first.next;
        }
        ListNode next = first.next.next;
        first.next = next;
        return hair.next;
    }
}
