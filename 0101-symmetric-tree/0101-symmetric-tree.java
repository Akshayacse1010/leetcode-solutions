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
    public boolean check(TreeNode t , TreeNode root){
        if(t==null || root==null){
           if(t==null && root == null){
               return true;
           }
           else{
               return false;
           }
        }
        if(t.val == root.val && check(t.left , root.right)&& check(t.right , root.left)){
            return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
       if(root == null){
           return true;
       }
       boolean r =  check(root.left,root.right);
       return r;
    }
}