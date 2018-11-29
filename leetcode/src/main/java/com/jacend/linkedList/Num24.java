package com.jacend.linkedList;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * 说明:
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @author fengxf
 * @since 2018-10-18
 */
public class Num24 {

    public ListNode swapPairs(ListNode head) {
        // 哨兵节点
        ListNode h = new ListNode(-1);
        h.next = head;

        ListNode pre = h;

        while (pre.next != null && pre.next.next != null) {
            ListNode a = pre.next;
            ListNode b = a.next;
            ListNode la = b.next;

            pre.next = b;
            b.next = a;
            a.next = la;

            pre = a;
        }

        return h.next;
    }

    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode t = head.next;
        // 下一个问题
        head.next = swapPairs2(head.next.next);
        t.next = head;
        return t;
    }
}
