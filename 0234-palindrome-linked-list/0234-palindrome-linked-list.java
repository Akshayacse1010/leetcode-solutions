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
    public boolean isPalindrome(ListNode head) {
        int c = 0;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        ListNode fast = head;
       ListNode slow = head;
        while(fast!=null && fast.next!=null && next!=null){
            c+=1;
                       slow = slow.next;
                fast = fast.next.next;
         

     
            present.next =prev;
           prev = present;
           present = next;
                          next = next.next;
        }
        if(fast!=null && fast.next==null){
            present = present.next;
        }
        while(prev!=null && present!=null){
            if(prev.val!= present.val){
                    return false;
            }
            prev = prev.next;
            present = present.next;
        }
        return true;
    }
}