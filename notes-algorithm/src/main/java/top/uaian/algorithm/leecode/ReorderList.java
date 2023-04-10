package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class ReorderList {

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode listNode1 = new ListNode(4, tail);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode head = new ListNode(1, listNode3);
        reorderList(head);
        System.out.println(head);
    }

    public static void reorderList(ListNode head) {
        ListNode mid = findMidNode(head);
        ListNode next = mid.next;
        mid.next = null;
        ListNode node = reverseList(next);
        MergeTwoList(head, node);
    }

    private static void MergeTwoList(ListNode headOne, ListNode headTwo) {
        ListNode curNode = headOne;
        while (curNode != null && headTwo != null){
            ListNode nextTwo = headTwo.next;
            ListNode nextOne = curNode.next;
            headTwo.next = nextOne;
            curNode.next = headTwo;
            headTwo = nextTwo;
            curNode = nextOne;
        }

        if(headTwo != null){
            curNode.next = headTwo;
        }

    }

    private static ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        while (head != null){
            ListNode next = head.next;
            head.next = preNode;
            preNode = head;
            head = next;
        }
        return preNode;
    }

    private static ListNode findMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
