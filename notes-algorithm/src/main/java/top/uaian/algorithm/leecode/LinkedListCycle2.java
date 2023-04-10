package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class LinkedListCycle2 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(-4);
        ListNode listNode2 = new ListNode(0, tail);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode head = new ListNode(3, listNode3);
        tail.next = listNode3;
        ListNode hair = detectCycle(head);
        System.out.println(hair);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode bakCursor = head;
        if(head == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        while (true){
            if(slow.next == null || fast.next == null || fast.next.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while (slow != bakCursor){
                    slow = slow.next;
                    bakCursor = bakCursor.next;
                }
                return slow;
            }

        }
    }
}
