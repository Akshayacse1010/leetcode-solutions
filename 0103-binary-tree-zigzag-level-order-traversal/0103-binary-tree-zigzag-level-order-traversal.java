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
        List<List<Integer>> tli = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        if(root == null){
            return tli;
        }
        q.offer(root);
        boolean f = true;
        while(!q.isEmpty()){
            List<Integer> li = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0;i < size;i++){
                TreeNode n = q.poll();
               li.add(n.val);
               if(n.left!= null){
                   q.offer(n.left);
               }
               if(n.right!= null){
                   q.offer(n.right);
               }
            }
            if(f == true){
                tli.add(li);
            }
            if(f == false){
                 Collections.reverse(li);
                tli.add(li);
            }
          f = (f)? false:true;
        }
        return tli;
    }
}