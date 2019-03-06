package com.jacend.linkedList;

/**
 * @author fengxf
 * @since 2018-10-15
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }

    // 普通思路 迭代，不借助其他的数据结构
    public static ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode headNode = null;
        while (curNode != null) {
            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                headNode = curNode;
            }

            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return headNode;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList2(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static void printNode(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.println(curNode.val);
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(7);

        printNode(head);
        ListNode headNode = reverseList2(head);
        System.out.println("coco");
        printNode(headNode);
    }
}
