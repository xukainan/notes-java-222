package top.uaian.utils;

import top.uaian.model.algorithm.ListNode;

public class ListUtils {

    public static ListNode reverseList(ListNode head){
        ListNode curNode = head;
        ListNode preNode = null;
        while (curNode != null){
            ListNode next = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = next;
        }
        return preNode;
    }

    public static void reverseListToReturn(ListNode head, ListNode tail){
        ListNode curNode = head;
        tail = head;
        ListNode preNode = null;
        while (curNode != null){
            ListNode next = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = next;
        }
        head = preNode;
    }

}
