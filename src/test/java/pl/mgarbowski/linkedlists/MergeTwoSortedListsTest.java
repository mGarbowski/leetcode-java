package pl.mgarbowski.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private static final MergeTwoSortedLists M = new MergeTwoSortedLists();
    @Test
    void mergeTwoNonEmptyLists() {
        var left = ListNode.fromList(List.of(1, 2, 4));
        var right = ListNode.fromList(List.of(1, 3, 4));
        assertEquals(List.of(1, 1, 2, 3, 4, 4), M.mergeTwoLists(left, right).toList());
    }

    @Test
    void mergeTwoEmptyLists() {
        assertNull(M.mergeTwoLists(null, null));
    }

    @Test
    void mergeEmptyWithNonempty() {
        assertEquals(List.of(0), M.mergeTwoLists(null, new ListNode(0)).toList());
    }
}