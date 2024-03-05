package pl.mgarbowski.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {
    private static final ReorderList R = new ReorderList();
    @Test
    void reorderEvenLength() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4));
        var expected = List.of(1, 4, 2, 3);
        R.reorderList(head);
        assertEquals(expected, head.toList());
    }

    @Test
    void reorderOddLength() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        var expected = List.of(1, 5, 2, 4, 3);
        R.reorderList(head);
        assertEquals(expected, head.toList());
    }

    @Test
    void findMiddleEvenLength() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4));
        var expected = head.next;
        assertEquals(expected, R.findMiddle(head));
    }

    @Test
    void findMiddleOddLength() {
        var head = ListNode.fromList(List.of(1, 2, 3, 4, 5));
        var expected = head.next.next;
        assertEquals(expected, R.findMiddle(head));
    }
}