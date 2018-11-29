package com.jacend.linkedList;

import java.util.Stack;

/**
 * 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @author fengxf
 * @since 2018-10-16
 */
public class Num206 {

    // 普通思路 迭代，不借助其他的数据结构
    public ListNode reverseList(ListNode head) {
        // 反转过程中记录的前驱节点
        ListNode previousNode = null;
        // 当前节点
        ListNode currentNode = head;
        // 反转后头节点
        ListNode headNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                headNode = currentNode;
            }

            // 以前驱节点作为反转后的后驱节点
            currentNode.next = previousNode;
            // 以当前节点作为过程中的前驱节点，处理下一个节点反转做准备
            previousNode = currentNode;
            // 以当前节点后驱节点作为当前节点
            currentNode =  nextNode;
        }

        return headNode;
    }
}
