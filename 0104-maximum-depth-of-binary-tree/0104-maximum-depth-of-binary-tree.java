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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
       
       int h1 = find(root.left , 1);
      int h2 =  find(root.right , 1);
       return (h1>h2)? h1: h2;
    }

    public int find(TreeNode node ,int h){
        if(node == null){
            return h;
        }
        
        int l =  find(node.left ,h +1);
        int r = find(node.right ,h +1);
        return (l > r)? l : r;
    }
}