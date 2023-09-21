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
    
    public TreeNode merge(TreeNode n1 ,TreeNode n2 ){
        if(n1==null && n2== null){
            return null;
        }
        if(n1!= null && n2== null){
            return n1;
        }
                if(n1== null && n2!= null){
            return n2;
        }
       TreeNode node = new TreeNode(n1.val +n2.val);
       node.left =  merge(n1.left ,n2.left);
        node.right = merge(n1.right,n2.right);
        return node;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2==null){
            return root1;
        }
        return merge(root1 , root2);
     
    }
}