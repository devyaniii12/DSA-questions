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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        int[] arr=new int[s];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        return bSearch(arr,0,s-1);
        
    }
    TreeNode bSearch(int[] nums,int low,int high){
        if(low>high){ return null;}
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=bSearch(nums,low,mid-1);
        root.right=bSearch(nums,mid+1,high);
        return root;
        }
}