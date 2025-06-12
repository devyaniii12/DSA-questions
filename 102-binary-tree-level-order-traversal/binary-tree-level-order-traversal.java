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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=height(root);
        for(int i=1;i<=n;i++){
            List<Integer> t=new ArrayList<>();
            preorder(root,i,t);
            ans.add(t);
        }
        return ans;
    }
    void preorder(TreeNode root,int n,List<Integer> l){
        if(root==null) return;
        if(n==1) l.add(root.val);
        preorder(root.left,n-1,l);
        preorder(root.right,n-1,l);
    }

    int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}