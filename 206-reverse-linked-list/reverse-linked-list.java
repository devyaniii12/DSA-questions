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
    public ListNode reverseList(ListNode head) {
        //Recursive approach - T.C=O(N) S.C=O(N)
        // if(head==null || head.next==null) return head;
        // ListNode newNode=reverseList(head.next);
        // head.next.next=head;
        // head.next=null;
        // return newNode;

        //prev curr agla approach
        ListNode prev=null,agla=null;
        ListNode curr=head;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
}