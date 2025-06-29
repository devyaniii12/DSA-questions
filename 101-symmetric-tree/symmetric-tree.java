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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
       return checkmirror(root.left,root.right) ;
    }
    boolean checkmirror(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        return (l.val==r.val) && (checkmirror(l.left,r.right) && checkmirror(l.right,r.left));
    }
}
