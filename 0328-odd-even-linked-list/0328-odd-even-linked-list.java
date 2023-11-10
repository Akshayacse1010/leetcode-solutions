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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode last = head.next;
        boolean f= true;
        ListNode dummy = head;
        while(node1!=null && node2!=null){
            if(f){
                if(node2.next==null){
                    dummy = node1;
                }
                node1.next = node2.next;
                node1 = node1.next;
                f  = false;
            }
            else{
                node2.next = node1.next;
                node2 = node2.next;
                f = true;
            }
        }
        if(node1==null){
            dummy.next = last;
            return head;
        }
        node1.next = last;
        return head;
        
    }
}