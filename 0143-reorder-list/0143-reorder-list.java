/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        int c = 0;
        ListNode slow = head;
        ListNode fast = head;
        ListNode slow1 = head;
        while(fast!=null && fast.next!=null){
            c++;
            slow1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
      if(c!=0){
 if(fast!=null && fast.next == null){
            slow1 = slow;
            slow = slow.next;
        }
        slow1.next = null;
       ListNode prev = null;
       ListNode present = slow;
       ListNode next = present.next;
       while(present!=null){
           present.next =prev;
           prev = present;
           present = next;
           if(next!=null){
               next =next.next;
           }
       }
        ListNode start = head;
        ListNode med = start;
        ListNode dummy = prev;
        while(start!=null && prev!=null){
            dummy = prev.next;
            med = start.next;

            start.next = prev;
            prev.next = med;
            start = med;
            prev = dummy;
        }
        med = null;
      }
       
    }
}