/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
            
boolean f = false;
 if(!f){
                Node n = q.poll();
                if(n.left != null){
                q.offer(n.left);
                q.offer(n.right);
                }

                n.next = null;
                f = true;
            }
    while(!q.isEmpty()){
      
      Node n1 = q.poll();
      int size = q.size();
     
        for(int i= 0; i< size ;i++){
            Node n2 = q.poll();
            n1.next = n2;
            n2.next = null;
            if(n1.left != null){
                  q.offer(n1.left);
                q.offer(n1.right);
            }
              if(n2.left != null){
                  q.offer(n2.left);
                q.offer(n2.right);
            }
            n1 = n2;
        }
     
    }
return root;
    }
}