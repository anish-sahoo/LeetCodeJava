public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode copy = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return copy;
    }
    public static void main(String[] args) {
        Solution206 solution = new Solution206();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.reverseList(head);
        ListNode.toString("result", result);
    }
}

// https://leetcode.com/problems/reverse-linked-list/