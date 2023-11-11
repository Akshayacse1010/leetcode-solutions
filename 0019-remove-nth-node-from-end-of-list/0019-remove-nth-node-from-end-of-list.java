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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            int length = 0;
            if(head.next==null){
                return null;
            }
        ListNode slow = head;
        ListNode s = head;
        ListNode f = head;
        ListNode fast  = head;
        int c = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            length++;
            fast = fast.next.next;
        }
        if(fast!=null && fast.next==null){
            length = length*2 + 1;
        }
        else{
            length = 2* length;
        }
        if(length - n == 0 ){
            head = head.next;
            s.next = null;
            return head;
        }
        while(c < length - n){
            s = f;
            f = f.next;
            c++;
        }
        s.next = f.next;
        f.next = null;
    return head;
    }
}