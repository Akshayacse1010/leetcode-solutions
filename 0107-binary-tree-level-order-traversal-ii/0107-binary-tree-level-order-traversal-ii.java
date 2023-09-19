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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
               List<List<Integer>> tli = new ArrayList<>();
       if(root == null){
           return tli;
       }
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       

       while(!q.isEmpty()){
           int size = q.size();
        List<Integer> l = new ArrayList<>(size);
           for(int i = 0;i<size ; i++){
   TreeNode node = q.poll();
   l.add(node.val);
   if(node.left!=null)
   {
      q.offer(node.left);
   }
   if(node.right!=null)
   {
      q.offer(node.right);
   }
    }
    tli.add(l);
    }
Collections.reverse(tli);
return tli;
    }
}