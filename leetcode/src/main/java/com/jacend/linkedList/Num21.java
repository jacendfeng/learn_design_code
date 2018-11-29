package com.jacend.linkedList;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author fengxf
 * @since 2018-10-15
 */
public class Num21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode mergeList;
        if (l1.val < l2.val) {
            mergeList = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            mergeList = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode tempNode = mergeList;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next;
                tempNode = tempNode.next;
                continue;
            }

            if (l2 == null) {
                tempNode.next = new ListNode(l1.val);
                l1 = l1.next;
                tempNode = tempNode.next;
                continue;
            }

            if (l1.val < l2.val) {
                tempNode.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            tempNode = tempNode.next;
        }

        return mergeList;
    }
}
