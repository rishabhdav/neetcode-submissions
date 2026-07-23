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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode  temp=head;
        while(temp.next!=null){
            int val1=temp.val;
            int val2=temp.next.val;
            ListNode newNode =new ListNode(gcd(val1,val2));
            ListNode nextptr=temp.next;
            temp.next=newNode;
            newNode.next=nextptr;
            temp=nextptr;

        }

return head;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}