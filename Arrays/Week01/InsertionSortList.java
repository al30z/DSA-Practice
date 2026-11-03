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
    public ListNode insertionSortList(ListNode head) {
        // Dummy node to simplify insertion at head
        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            ListNode prev = dummy;

            // Find correct position in sorted part
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Save next node
            ListNode nextTemp = current.next;

            // Insert current between prev and prev.next
            current.next = prev.next;
            prev.next = current;

            // Move to next node in original list
            current = nextTemp;
        }

        return dummy.next;
    }
}
