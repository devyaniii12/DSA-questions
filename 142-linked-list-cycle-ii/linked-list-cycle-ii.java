/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        if(head==null || head.next==null){
            return null;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null ||fast.next==null){
            return null;
        }
        while(temp!=slow){
                temp=temp.next;
                slow=slow.next;
            }
            return slow;
    }
}