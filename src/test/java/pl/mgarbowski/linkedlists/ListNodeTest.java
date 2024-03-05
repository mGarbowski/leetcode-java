package pl.mgarbowski.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    @Test
    void fromEmptyList() {
        var head = ListNode.fromList(new ArrayList<>());
        assertNull(head);
    }

    @Test
    void fromListSingleElement() {
        var list = List.of(0);
        var head = ListNode.fromList(list);
        assertEquals(0, head.val);
        assertNull(head.next);
    }

    @Test
    void fromListMultipleElements() {
        var list = List.of(0, 1, 2, 3, 4);
        var node = ListNode.fromList(list);

        assertEquals(0, node.val);
        assertNotNull(node.next);
        node = node.next;

        assertEquals(1, node.val);
        assertNotNull(node.next);
        node = node.next;

        assertEquals(2, node.val);
        assertNotNull(node.next);
        node = node.next;

        assertEquals(3, node.val);
        assertNotNull(node.next);
        node = node.next;

        assertEquals(4, node.val);
        assertNull(node.next);
    }

    @Test
    void toListSingleNode() {
        var head = new ListNode(0);
        assertEquals(List.of(0), head.toList());
    }

    @Test
    void toListMultipleNodes() {
        var head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        assertEquals(List.of(0, 1, 2, 3), head.toList());
    }

    @Test
    void toAndFromListMatches() {
        var list = List.of(0, 1, 2, 3, 4);
        assertEquals(list, ListNode.fromList(list).toList());
    }
}