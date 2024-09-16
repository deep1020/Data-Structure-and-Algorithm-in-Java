package Binary_Search_Tree;


public class minimum_absolute_difference_in_BST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;

        }
    }
    private static TreeNode prev=null;
    private static int result=Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root){
        if(root==null){
            return result;
        }
        getMinimumDifference(root.left);
        if(prev!=null){
            result=Math.min(result,root.val-prev.val);
        }
        prev=root;
        getMinimumDifference(root.right);
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int result=getMinimumDifference(root);
        System.out.println(result);
    }
}
