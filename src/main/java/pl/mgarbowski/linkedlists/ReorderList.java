package pl.mgarbowski.linkedlists;

/**
 * <a href="https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 */
public class ReorderList {

    /**
     * Time complexity O(n)
     * Space complexity O(1)
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        var left = head;
        var middle = findMiddle(head);
        var right = middle.next;
        middle.next = null;
        right = ReverseLinkedList.reverseListIterative(right);

        ListNode nextLeft;
        ListNode nextRight;

        while (right != null) {
            nextLeft = left.next;
            left.next = right;
            left = nextLeft;

            nextRight = right.next;
            right.next = left;
            right = nextRight;
        }
    }

    /**
     * @param head head of the input list
     * @return floor((n+1)/2) th node
     */
    ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var fast = head;
        var slow = head;
        var idx = 0;
        while (fast.next != null) {
            idx++;
            fast = fast.next;
            if (idx % 2 == 0) {
                slow = slow.next;
            }
        }

        return slow;
    }
}
