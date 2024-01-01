package Binary_tree;

public class sum_nodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static int sumtOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumtOfNodes(root.left);
        int rightSum=sumtOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(sumtOfNodes(root));
    }
}

// T.C -> O(n)
// S.C -> O(n)

// sum of nodes for left subtree
// sum of nodes for right subtree
// add count of left subtree + right subtree + root value
