//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head){
      Node prev = null;
      Node present = head;
  Node next = present.next;
       while(present!=null){
           present.next =prev;
           prev = present;
           present = next;
           if(next!=null){
               next =next.next;
           }
       }
        return  prev;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head.next == null){
            if(head.data == 9){
                Node next = new Node(0);
                head.data = 1;
                head.next = next;
                return head;
            }
            head.data = head.data + 1;
            return head;
        }
       head =  reverse(head);
       boolean f = false;
    Node temp = head;
        while(temp!= null){
            if(temp.data < 9){
                temp.data = temp.data  + 1;
                f = true;
                break;
            }
            temp.data = 0;
           
            if(temp.next == null){
               break;
            }
             temp = temp.next;
        }
        if(temp.next==null && f!=true){
            Node next = new Node(1);
            temp.next = next;
 
        }
       head =  reverse(head);
        return head;
    }
}
