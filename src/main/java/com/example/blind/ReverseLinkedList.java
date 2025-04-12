package com.example.blind;

public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     * */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head) {
          //1-2-3-4-5
          //5-4-3-2-1
          //1.next=2.next=3.next=4.next=5.next=null
          //5.next=4.next=3.next=2.next=1.next=1
         //1.next=null 2.next==1 3.next=2
          ListNode prev=null;
          ListNode curr =head;

          while(curr!=null){
              ListNode temp=curr.next;
              curr.next=prev;
              prev=curr;
              curr=temp;
          }

          return prev;



    }

}
