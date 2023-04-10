package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode listNode1 = new ListNode(4, tail);
        ListNode listNode2 = new ListNode(8, listNode1);
        ListNode listNode3 = new ListNode(1, listNode2);
        ListNode head1 = new ListNode(4, listNode3);
        ListNode listNode5 = new ListNode(1, listNode2);
        ListNode listNode4 = new ListNode(6, listNode5);
        ListNode head2 = new ListNode(5, listNode4);
        System.out.println(getIntersectionNode(head1, head2));
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cursorA = headA;
        ListNode cursorB = headB;
        while (cursorA != null && cursorB != null){
            if(cursorA == cursorB){
                return cursorA;
            }
            if(cursorA.next == null && cursorB.next == null){
                return null;
            }
            cursorA = cursorA.next == null ? headB : cursorA.next;
            cursorB = cursorB.next == null ? headA : cursorB.next;

        }
        return null;
    }
}
