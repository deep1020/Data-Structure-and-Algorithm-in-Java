package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class binary_tree_isHeap_check {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static boolean isHeap(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node current=q.peek();
            q.remove();
            if(current.left!=null){
                if(current.data<current.left.data){
                    return false;
                }
                q.add(current.left);
            }
            if(current.right!=null){
                if(current.data<current.right.data){
                    return false;
                }
                q.add(current.right);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(9);
        root.right=new Node(8);
        root.left.left=new Node(7);
        root.left.right=new Node(6);
        if(isHeap(root)){
            System.out.println("Given Binary tree is heap");
        }
        else {
            System.out.println("Given Binary tree is not heap");
        }
    }
}
// T.C -> O(n)
// S.C -> O(n)
