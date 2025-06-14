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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
       int count=noOfPaths(root,(long)targetSum);
        count+=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return count;
    }
    public int noOfPaths(TreeNode root, long targetSum){
        int count=0;
        if(root==null) return 0;
        if(root!=null && (long)root.val==targetSum){
            count++;
        }
        return count+noOfPaths(root.left,targetSum-(long)root.val)+noOfPaths(root.right,targetSum-(long)root.val);
    }
}