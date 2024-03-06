import java.util.HashSet;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        while(head != null) {
            if (!visitedNodes.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

// https://leetcode.com/problems/linked-list-cycle/