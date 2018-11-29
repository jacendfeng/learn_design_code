package com.jacend.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fengxf
 * @since 2018-10-16
 */
public class Num141 {

    /**
     * 我们可以通过检查一个结点此前是否被访问过来判断链表是否为环形链表。常用的方法是使用哈希表。
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> haveSeen = new HashSet<>();
        while (head != null) {
            if (haveSeen.contains(head)) {
                return true;
            }

            haveSeen.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 快慢指针 总会相遇
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
