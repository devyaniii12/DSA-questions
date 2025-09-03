/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; 
        }

        // ListNode ptrA = headA;
        // ListNode ptrB = headB;

        // while (ptrA != ptrB) {
       
        //     ptrA = (ptrA == null) ? headB : ptrA.next;
        //     ptrB = (ptrB == null) ? headA : ptrB.next;
        // }

       
        // return ptrA;

        ListNode temp1=headA;
        ListNode temp2=headB;
        int countA=0,countB=0;
        while(temp1!=null){
            countA++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            countB++;
            temp2=temp2.next;
        }
        int stepsize=0;
        if(countA>countB)  stepsize=countA-countB;
        else stepsize=countB-countA;
        temp1=headA;
        temp2=headB;

        for(int i=0;i<stepsize;i++){
            if(countA>countB) temp1=temp1.next;
            else temp2=temp2.next;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
