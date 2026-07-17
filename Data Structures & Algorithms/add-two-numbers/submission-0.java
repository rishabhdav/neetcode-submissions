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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(temp1!=null||temp2!=null){
            int val1=temp1==null?0:temp1.val;
            int val2=temp2==null?0:temp2.val;
            int sum=val1+val2+carry;
            ListNode newNode=new ListNode(sum%10);
            temp.next=newNode;
            temp=newNode;
            carry=sum/10;
        if(temp1!=null)    temp1=temp1.next;
          if(temp2!=null)  temp2=temp2.next;


        }
        if(carry!=0){
        ListNode newNode=new ListNode(carry);
        temp.next=newNode;
        temp=newNode;
        
        }
        return dummy.next;

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
