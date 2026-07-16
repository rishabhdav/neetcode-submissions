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
        if(head.next==null||head==null) return ;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode temp = head;
        slow=reverseIt(slow);
        while (temp != null && slow != null) {
            ListNode left = temp.next;
            ListNode right = slow.next;
            temp.next = slow;

            temp = left;
            slow.next = left;
            slow = right;
        }
   
      if(slow!=null){
        prev.next.next=slow;
      }
      
    }
    public static ListNode reverseIt(ListNode  root){
        ListNode prev=null;
        ListNode curr=root;
        while(curr!=null){
            ListNode fast=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fast;
        }
        return prev;
    }
}
