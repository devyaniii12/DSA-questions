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
    public void flatten(TreeNode root) {
        // approach1
        // if(root==null) return;
        // TreeNode leftTree=root.left;
        // TreeNode rightTree=root.right;
        // root.left=null;
        // flatten(leftTree);
        // flatten(rightTree);
        // root.right=leftTree;
        // TreeNode temp=leftTree;
        // while(temp!=null && temp.right!=null){
        //     temp=temp.right;
        // }
        // if(temp!=null) temp.right=rightTree;
        // else root.right=rightTree;

        //approach2
        while(root!=null){
            if(root.left!=null){
                TreeNode pred=root.left;
                while(pred.right!=null){
                    pred=pred.right;
                }
                pred.right=root.right;
                root.right=root.left;
                root.left=null;
            }
            root=root.right;
        }

        
    }
}