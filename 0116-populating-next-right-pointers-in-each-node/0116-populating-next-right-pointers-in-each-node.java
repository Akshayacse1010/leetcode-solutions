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
    Deque<Node> q = new ArrayDeque<>();
    q.addLast(root);
            
boolean f = false;
 if(!f){
                Node n = q.pollLast();
                if(n.left != null){
                q.offerFirst(n.left);
                q.offerFirst(n.right);
                }

                n.next = null;
                f = true;
            }
    while(!q.isEmpty()){
      
      Node n1 = q.pollLast();
      int size = q.size();
      Deque<Node> q2 = new ArrayDeque<>();
        for(int i= 0; i< size ;i++){
            Node n2 = q.pollLast();
            n1.next = n2;
            n2.next = null;
            if(n1.left != null){
                  q.offerFirst(n1.left);
                q.offerFirst(n1.right);
            }
              if(n2.left != null){
                  q.offerFirst(n2.left);
                q.offerFirst(n2.right);
            }
            n1 = n2;
        }
     
    }
return root;
    }
}