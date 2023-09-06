// Runtime - 0ms, Beats 100% of users with Java
// memory - 40.36mb, Beats 84.65% of users with Java

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1){
            return null;
        }
        ListNode copy = head;
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        ListNode answer = new ListNode(), pointer = answer;
        while (copy != null){
            if(count != n) {
                pointer.val = copy.val;
                if (copy.next != null && (count-1 != 1 || n!=1) ) {
                    pointer.next = new ListNode();
                    pointer = pointer.next;
                }
            }
            copy = copy.next;
            count--;
        }
        return answer;
    }

    public static void main(String[] args) {
        ListNode question = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode q2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode q3 = new ListNode(1, new ListNode(2));

        ListNode answer = new Solution19().removeNthFromEnd(q2, 1);
        ListNode.toString("answer",answer);
        System.out.println("\n\n");
        answer = new Solution19().removeNthFromEnd(question, 2);
        ListNode.toString("answer",answer);
        System.out.println("\n\n");
        answer = new Solution19().removeNthFromEnd(new ListNode(1), 1);
        ListNode.toString("answer",answer);
        System.out.println("\n\n");
        answer = new Solution19().removeNthFromEnd(q3, 1);
        ListNode.toString("answer",answer);

    }
}
