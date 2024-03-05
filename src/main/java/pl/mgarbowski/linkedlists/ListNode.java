package pl.mgarbowski.linkedlists;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public List<Integer> toList() {
        var list = new ArrayList<Integer>();
        var node = this;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }

    static ListNode fromList(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }

        var head = new ListNode(list.get(0));
        var node = head;
        for (int i = 1; i < list.size(); i++) {
            node.next = new ListNode(list.get(i));
            node = node.next;
        }

        return head;
    }
}
