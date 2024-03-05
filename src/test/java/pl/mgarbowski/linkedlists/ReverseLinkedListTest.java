package pl.mgarbowski.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static pl.mgarbowski.linkedlists.ReverseLinkedList.reverseListIterative;
import static pl.mgarbowski.linkedlists.ReverseLinkedList.reverseListRecursive;

class ReverseLinkedListTest {

    @Test
    void reverseMultipleNodes() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), reverseListIterative(head).toList());
    }

    @Test
    void reverseTwoNodes() {
        var head = ListNode.fromList(List.of(1, 2));
        assertEquals(List.of(2, 1), reverseListIterative(head).toList());
    }

    @Test
    void reverseOneNode() {
        var head = new ListNode(0);
        assertEquals(List.of(0), reverseListIterative(head).toList());
    }

    @Test
    void reverseEmptyList() {
        assertNull(reverseListIterative(null));
    }

    @Test
    void reverseRecursiveMultipleNodes() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveTwoNodes() {
        var head = ListNode.fromList(List.of(1, 2));
        assertEquals(List.of(2, 1), reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveOneNode() {
        var head = new ListNode(0);
        assertEquals(List.of(0), reverseListRecursive(head).toList());
    }

    @Test
    void reverseRecursiveEmptyList() {
        assertNull(reverseListRecursive(null));
    }
}