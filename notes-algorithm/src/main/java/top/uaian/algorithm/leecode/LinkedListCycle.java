package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(-4);
        ListNode listNode2 = new ListNode(0, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode head1 = new ListNode(3, listNode1);
        listNode3.next = listNode1;
        System.out.println(hasCycle(head1));
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
