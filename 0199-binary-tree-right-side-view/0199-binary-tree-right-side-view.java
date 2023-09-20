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
    int maxlevel = 0;
    public void addNode(TreeNode node, List<Integer>li , int level){
        if(node == null){
            return;
        }
        if(maxlevel < level){
            li.add(node.val);
            maxlevel = level;
        }
      addNode(node.right , li , level + 1);
       addNode(node.left , li , level + 1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>li = new ArrayList<>();
        if(root == null){
            return li;
        }
        addNode(root , li , 1);
        return li;
    }
}