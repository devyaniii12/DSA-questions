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
        ListNode curr=head,prev=null,Next=null;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public ListNode fkn(ListNode temp,int k)
    {
        k--;
        while(temp!=null && k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode knode=fkn(temp,k);
            if(knode==null)
            {
                if(prev!=null)
                {
                    prev.next=temp;
                }
                break;
            }
            ListNode nextnode=knode.next;
            knode.next=null;
            reverseList(temp);
            if(temp==head)
            {
                head=knode;
            }
            else{
                prev.next=knode;
            }
            prev=temp;
            temp=nextnode;
        }
        return head;
    }
}