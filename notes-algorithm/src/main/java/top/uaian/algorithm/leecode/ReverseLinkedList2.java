package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class ReverseLinkedList2 {

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode listNode1 = new ListNode(4, tail);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode head = new ListNode(1, listNode3);
        ListNode hair = reverseBetween(head, 2, 4);
        System.out.println(head);
    }


    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode hair = new ListNode();
        hair.next = head;
        int start = 1;
        ListNode preNode = hair;
        while (start < left){
            preNode = head;
            head = head.next;
            start++;
        }
        ListNode startNode = preNode.next;
        preNode.next = null;
        while (start < right){
            head = head.next;
            start++;
        }
        ListNode nextNode = head.next;
        head.next = null;
        ListNode[] listNodes = reverseListNode(startNode, head);
        preNode.next = listNodes[0];
        listNodes[1].next = nextNode;
        return hair.next;
    }

    private static ListNode[] reverseListNode(ListNode startNode, ListNode head) {
        ListNode tail = startNode;
        ListNode preNode = null;
        while (startNode != null){
            ListNode next = startNode.next;
            startNode.next = preNode;
            preNode = startNode;
            startNode = next;
        }

        return new ListNode[]{head, tail};
    }
}
