public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            if(list2 != null){
                return list2;
            }
            else return null;
        }
        else if(list2 == null){
            return list1;
        }

        ListNode answer = new ListNode(), pointer = answer;
        int a1 = list1.val, a2 = list2.val;

        while(list1 != null && list2 != null){
            while(a1 <= a2){
                pointer.val = a1;
                list1 = list1.next;
                if(list1 != null){
                    a1 = list1.val;
                    pointer.next = new ListNode();
                    pointer = pointer.next;
                }
                else break;
            }
            ListNode.toString("pointer", answer);
            ListNode.toString("list1", list1);
            ListNode.toString("list2", list2);
            System.out.println();
            while(a2 <= a1){
                pointer.val = a2;
                list2 = list2.next;
                if(list2 != null){
                    a2 = list2.val;
                    pointer.next = new ListNode();
                    pointer = pointer.next;
                }
                else break;
            }
            ListNode.toString("pointer", answer);
            ListNode.toString("list1", list1);
            ListNode.toString("list2", list2);
            System.out.println();
            if(list1 != null || list2 != null){
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
            ListNode.toString("pointer", answer);
            ListNode.toString("list1", list1);
            ListNode.toString("list2", list2);
            System.out.println();
        }
        while(list1 != null){
        }
        while (list2 != null){
        }
        return answer;
    }

    public static void main(String[] args) {
        ListNode.toString("Ans1", new Solution21().mergeTwoLists(
            new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(2, new ListNode(3)))
        ));
//        ListNode.toString("Ans2", new Solution21().mergeTwoLists(new ListNode(1), null));
    }
}

//ListNode.toString("pointer", pointer);
//        ListNode.toString("list1", list1);
//        ListNode.toString("list2", list2);
//        System.out.println();
//        System.out.println();
