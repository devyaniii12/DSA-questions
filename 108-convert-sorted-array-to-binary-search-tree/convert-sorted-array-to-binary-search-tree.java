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
    public TreeNode sortedArrayToBST(int[] nums) {
        int low=0;
        int high=nums.length-1;
        return bSearch(nums,low,high);
    
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