package Stack;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class symmetric_tree {
    private static TreeNode root;
    static boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root.left);
        st.push(root.right);
        while (!st.empty()){
            TreeNode node1=st.pop();
            TreeNode node2=st.pop();
            if(node1==null && node2==null){
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            st.push(node1.left);
            st.push(node2.right);
            st.push(node1.right);
            st.push(node2.left);
        }
        return true;
    }
    public static void main(String[] args) {
        symmetric_tree tree = new symmetric_tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(3);
        if (isSymmetric(root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }
}
