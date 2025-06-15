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
    static int sum=0;
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        inorderUlta(root);
        return root;
    }
    void inorderUlta(TreeNode root){
        if(root==null) return;
        inorderUlta(root.right);
        root.val=root.val+sum;
        sum=root.val;
        inorderUlta(root.left);
    }
}