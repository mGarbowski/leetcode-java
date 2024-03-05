package pl.mgarbowski.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {
    private static final ReverseLinkedList R = new ReverseLinkedList();

    @Test
    void reverseMultipleNodes() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), R.reverseListIterative(head).toList());
    }

    @Test
    void reverseTwoNodes() {
        var head = ListNode.fromList(List.of(1, 2));
        assertEquals(List.of(2, 1), R.reverseListIterative(head).toList());
    }

    @Test
    void reverseOneNode() {
        var head = new ListNode(0);
        assertEquals(List.of(0), R.reverseListIterative(head).toList());
    }

    @Test
    void reverseEmptyList() {
        assertNull(R.reverseListIterative(null));
    }

    @Test
    void reverseRecursiveMultipleNodes() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), R.reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveTwoNodes() {
        var head = ListNode.fromList(List.of(1, 2));
        assertEquals(List.of(2, 1), R.reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveOneNode() {
        var head = new ListNode(0);
        assertEquals(List.of(0), R.reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveEmptyList() {
        assertNull(R.reverseListRecursive(null));
    }


}