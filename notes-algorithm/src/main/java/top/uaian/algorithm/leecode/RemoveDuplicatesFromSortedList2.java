package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class RemoveDuplicatesFromSortedList2 {

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode listNode1 = new ListNode(4, tail);
        ListNode listNode4 = new ListNode(4, listNode1);
        ListNode listNode5 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(3, listNode5);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode head = new ListNode(1, listNode3);
        deleteDuplicates(head);
        System.out.println(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode cur = head;
        ListNode pre = hair;
        while (cur != null){
            ListNode next = cur.next;
            while (next != null && next.val == cur.val){
                next = next.next;
            }

            if(next != cur.next){
                pre.next = next;
                cur = next;
            }else {
                pre = pre.next;
                cur = cur.next;
            }

        }
        return hair.next;
    }
}
