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
        int countA=0;
        while(temp1!=null){
            countA+=1;
            temp1=temp1.next;
        }
        int countB=0;
        while(temp2!=null){
            countB+=1;
            temp2=temp2.next;
        }
        int n;
        if(countA>countB){
             n=countA-countB;
        }else{
            n=countB-countA;
        }
        temp1=headA;
        temp2=headB;
        for(int i=1;i<=n;i++){
            if(countA>countB){
                temp1=temp1.next;
            }
            else{
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
