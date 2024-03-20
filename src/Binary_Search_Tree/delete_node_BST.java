package Binary_Search_Tree;

public class delete_node_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else { // root.data==val
            // case 1: No child
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2: One child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // case 3: Two child (Find left most node in right subtree)
            Node inorder=inorderSuccessor(root.right);
            root.data=inorder.data;
            root.right=delete(root.right,inorder.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={5,3,12,1,4,8,6,7,13,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root,5);
        inorder(root);
    }
}
