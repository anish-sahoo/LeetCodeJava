public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        } //edge cases
        ListNode answer = new ListNode(), pointer = answer;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }
            else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        pointer.next = (list1 == null)? list2 : list1;
        return answer.next;
    }

    public static void main(String[] args) {
        ListNode.toString("Ans1", new Solution21().mergeTwoLists(
            new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))
        ));
        ListNode.toString("Ans2", new Solution21().mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(2, new ListNode(3)))
        ));
    }
}