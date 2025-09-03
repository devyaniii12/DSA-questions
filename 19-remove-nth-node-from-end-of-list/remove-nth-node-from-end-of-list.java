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
        if(head==null) return null;
        int count=0;
        ListNode temp=head;
        ListNode dummy=new ListNode(0,head);
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=dummy;
        for(int i=0;i<count-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}