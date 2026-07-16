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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        ListNode prev = dummy;
        ListNode rightnext = null;
        int cnt = 1;
        while (cnt < left) {
            cnt++;
            prev = temp;
            temp = temp.next;
        }

        while (cnt < right) {
            cnt++;
            temp = temp.next;
        }
        rightnext = temp.next;

        temp.next = null;
        temp = prev.next;
        prev.next = null;

        ListNode temp1 = reverseIt(temp);

        prev.next = temp1;
        temp.next = rightnext;
        return dummy.next;
    }
    public static ListNode reverseIt(ListNode root) {
        ListNode prev = null;
        ListNode curr = root;
        while (curr != null) {
            ListNode fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        return prev;
    }
}