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
    public void invert(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode n = node.right;
        node.right = node.left;
        node.left = n;
        invert(node.right);
        invert(node.left);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
           invert(root);
           return root;
        }

    }
