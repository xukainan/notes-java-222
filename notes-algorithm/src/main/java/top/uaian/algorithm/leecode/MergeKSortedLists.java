package top.uaian.algorithm.leecode;

import top.uaian.model.algorithm.ListNode;

public class MergeKSortedLists {

    public static void main(String[] args) {
        ListNode listNode6  = new ListNode(8, null);
        ListNode listNode3  = new ListNode(4, listNode6);

        ListNode listNode5  = new ListNode(7, null);
        ListNode listNode4  = new ListNode(5, listNode5);

        ListNode listNode2  = new ListNode(3, null);
        ListNode listNode1  = new ListNode(-9, listNode2);

        ListNode[] listNodes = new ListNode[]{listNode1, listNode3, listNode4};
        ListNode listNode = mergeKLists(listNodes);
        System.out.println(listNode);
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        int start = 0, end =  lists.length - 1;
        return splitLists(start, end, lists);
    }

    private static ListNode splitLists(int start, int end, ListNode[] lists) {
        if(start == end)
            return lists[start];

        if(start > end)
            return null;

        int mid = (start + end) / 2;
        ListNode listNode1 = splitLists(start, mid, lists);
        ListNode listNode2 = splitLists(mid + 1, end, lists);

        return merget2ListNode(listNode1, listNode2);
    }

    private static ListNode merget2ListNode(ListNode curNode1, ListNode curNode2) {

        if (curNode1 == null || curNode2 == null) {
            return curNode1 != null ? curNode1 : curNode2;
        }

        ListNode head = new ListNode();
        ListNode curIndex = head;

        while (curNode1 != null && curNode2 != null){
            if(curNode1.val < curNode2.val){
                curIndex.next = curNode1;
                curIndex = curNode1;
                curNode1 = curNode1.next;
            }else {
                curIndex.next = curNode2;
                curIndex = curNode2;
                curNode2 = curNode2.next;

            }
        }

        curIndex.next= curNode1 != null?curNode1:curNode2;


        return head.next;
    }
}
