package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4, null);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode head2 = new ListNode(1, listNode2);
        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode5 = new ListNode(2, listNode4);
        ListNode head1 = new ListNode(1, listNode5);
        mergeTwoLists(head1, head2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode hair = new ListNode();
        ListNode curNode = hair;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                curNode.next = list1;
                curNode = curNode.next;
                list1 = list1.next;
            }else {
                curNode.next = list2;
                curNode = curNode.next;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            curNode.next = list1;
        }

        if(list2 != null){
            curNode.next = list2;
        }

        return hair.next;
    }
}
