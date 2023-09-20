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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int x1 = 0;
            int y1 = 0;
            int size = q.size();

            for(int i =0;i < size;i++){
               TreeNode n = q.poll();
            if(n.left != null && n.right != null){
    if((n.left.val == x && n.right.val == y) || (n.left.val == y && n.right.val ==x)){
                continue;
            }
            }    
        
            if(n.val == x){
                x1 = n.val;
            }
            if(n.val == y){
                y1 = n.val;
            }
                    if(n.left != null){
                q.offer(n.left);
            }
            if(n.right != null){
                q.offer(n.right);
            }
            }
            if(x1!=0 && y1!=0){
                return true;
            }
 
        }
        return false;
    }
}