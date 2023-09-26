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
    TreeNode b = new TreeNode();
    boolean f = false;
    public void checkNode(TreeNode node , int val){
        if(node==null){
            return;
        }
        if(node.val == val){
            b = node;
            f =true;
            return;
        }
        if(node.val > val){
            checkNode(node.left , val);
        }
        if(node.val < val){
            checkNode(node.right , val);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
         checkNode(root , val);
        if(!f){
            return null;
        }
        return b;
    }
}