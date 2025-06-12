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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>(); 
        int level=levels(root);
        for(int i=1;i<=level;i++){
            List<Integer> l=new ArrayList<>();
            if(i%2==0) nlevelpost(root,l,i);
            if(i%2!=0) nlevelpre(root,l,i);
            ans.add(l);
        }
        return ans;
    }
    int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    void nlevelpre(TreeNode root,List<Integer> l,int level){
        if(root==null) return;
        if(level==1) l.add(root.val);
        nlevelpre(root.left,l,level-1);
        nlevelpre(root.right,l,level-1);
    }
    void nlevelpost(TreeNode root,List<Integer> l,int level){
        if(root==null) return;
        if(level==1) l.add(root.val);
        nlevelpost(root.right,l,level-1);
        nlevelpost(root.left,l,level-1);
    }
}