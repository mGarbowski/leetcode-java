package pl.mgarbowski.linkedlists;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */
public class ReverseLinkedList {

    /**
     * Time complexity O(n)
     * Space complexity O(1) - no extra memory
     */
    public ListNode reverseListIterative(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var one = head;
        var two = head.next;
        one.next = null;
        while (two != null) {
            var next = two.next;
            two.next = one;
            one = two;
            two = next;
        }

        return one;
    }

    /**
     * Time complexity O(n)
     * Space complexity O(n) - one stack frame per list node
     */
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
