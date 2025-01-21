package com.example.solution;

public class CycleNode {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (fast.next != null ) {
                    fast = fast.next;
                    slow=slow.next;

                    if(slow==fast) return slow;
                }
            }
        }


        return null;

    }
}
