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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr=new ArrayList<>();
        hasPathSum(root,targetSum,new ArrayList<>(),arr);
        return arr;
    }
    public void hasPathSum(TreeNode root, int targetSum,List<Integer> ans,List<List<Integer>> arr){
       if(root==null) return;
       ans.add(root.val);
       if( root.left==null && root.right==null && root.val==targetSum){
        arr.add(new ArrayList<>(ans));
       } 
    hasPathSum(root.left,targetSum-root.val,ans,arr);
    hasPathSum(root.right,targetSum-root.val,ans,arr);
    ans.remove(ans.size()-1);

}}