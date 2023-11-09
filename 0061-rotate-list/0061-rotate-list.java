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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        // Find the length of the list and the tail node
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        // Adjust k to avoid unnecessary rotations
        k = k % length;

        // If k is 0, no rotation is needed
        if (k == 0) {
            return head;
        }

        // Find the new head and tail after rotation
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;  // Set the new tail's next to null
        tail.next = head;     // Connect the original tail to the original head

        return newHead;
    }
}
