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
        ListNode temp=head;
       ListNode slow=head;
       ListNode fast=head; 
       while( fast!=null&&fast.next!=null ){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode prev=null;
       ListNode midcurr=slow;
       ListNode agla=null;
       while(midcurr!=null){
        agla=midcurr.next;
        midcurr.next=prev;
        prev=midcurr;
        midcurr=agla;
       }
       ListNode ptr1=head;
       ListNode ptr2=prev;
        while(ptr2!=null){
            if(ptr1.val!=ptr2.val){
                return false;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;


    }
}