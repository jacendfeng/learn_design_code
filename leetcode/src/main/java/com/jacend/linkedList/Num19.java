package com.jacend.linkedList;

/**
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 n = 2.

 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 说明：

 给定的 n 保证是有效的。

 进阶：

 你能尝试使用一趟扫描实现吗？
 * @author fengxf
 * @since 2018-10-15
 */
public class Num19 {

    // 扫描一遍，确定数量 size  取 size-n， next-> null
    // 维护两个指向 相差 n

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1 = head;
        ListNode l2 = new ListNode(-1);
        ListNode result = l2; // 哨兵


        int gap = 0;
        while (l1 != null) {
            l1 = l1.next;
            gap ++;

            if (gap > n) {
                l2.next = new ListNode(head.val);
                head = head.next;
                l2 = l2.next;
            }
        }

        if (n != 1) {
            l2.next = head.next.next;
        }

        return result.next;
    }
}
