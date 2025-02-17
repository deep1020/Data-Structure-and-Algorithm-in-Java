package Binary_tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class max_avg_value_among_all_levels_BFS {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static double maximumAverage(TreeNode root){
        if(root==null){
            return 0.0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        double maxAverage=Double.MIN_VALUE;
        while(!q.isEmpty()){
            int levelSize=q.size();
            double levelSum=0.0;
            for(int i=0;i<levelSize;i++){
                TreeNode currNode=q.poll();
                levelSum+=currNode.val;
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
            double levelAverage=levelSum/levelSize;
            maxAverage=Math.max(maxAverage,levelAverage);
        }
        return maxAverage;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println("Maximum average of levels: "+maximumAverage(root));
    }
}
