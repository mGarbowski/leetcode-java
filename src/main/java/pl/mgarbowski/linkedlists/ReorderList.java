package pl.mgarbowski.linkedlists;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        var nodes = new ArrayList<ListNode>();
        var node = head;
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        var left = 0;
        var right = nodes.size() - 1;
        while (left < right) {
            nodes.get(left).next = nodes.get(right);
            left++;
            nodes.get(right).next = nodes.get(left);
            right--;
        }
        nodes.get(left).next = null;
    }
}
