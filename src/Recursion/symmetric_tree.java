package Recursion;


public class symmetric_tree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    private static TreeNode root;
    static boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
    }
    static boolean isSymmetric() {
        if(root==null){
            return true;
        }
        return isMirror(root,root);
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
        boolean output = tree.isSymmetric();
        if (output == true)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }
}

// Recursive function isMirror() that takes two trees(left and right) as an argument and
// returns true if trees are the mirror and false if trees are not mirrored.
// isMirror() function recursively checks two roots and subtrees under the root.
