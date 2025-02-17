package Binary_tree;
// A binary tree is symmetric if the root node's left subtree is a mirror reflection of the right subtree.
public class symmetric_tree {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.data != right.data) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        boolean result = isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}

// DFS Approach

// Node class contains two pointers left and right to its left and right children. It also contains data field to store value of the node.
// isSymmetric() method: It checks if the tree rooted at root is symmetric.
// Base case: If the root is null, the tree is considered symmetric
// If the tree is non-empty, the method calls the isMirror() method to check if the left and right subtrees are mirror images of each other.
// isMirror() method: It checks whether two subtrees (denoted by left and right) are mirror images of each other.
// Base case 1: If both left and right are null, they are mirrors of each other, so return true.
// Base case 2: If only one of the subtrees is null, they are not mirrors, so return false.
// If both subtrees are non-null but their data fields are not equal, they are not mirrors, so return false.
// If both subtrees have equal data values, we recursively check: left.left against right.right (mirroring), left.right against right.left (mirroring).
// If both recursive calls return true, the current subtrees are mirrors, so return true.
