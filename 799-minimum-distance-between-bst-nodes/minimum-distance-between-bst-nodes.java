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
    static TreeNode prev=null;
    static int minDiff=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        minDiff=Integer.MAX_VALUE;
        prev=null;
        inorder(root);
        return minDiff;

    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
           int diff=Math.abs(root.val-prev.val);
           minDiff=Math.min(minDiff,diff);
        }
        prev=root;
        inorder(root.right);
    }
}