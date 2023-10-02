package Recursion;

public class count_paths_in_matrix {
    static int countPaths(int i,int j,int n,int m){
        // Reach at boundary now we are trying to go outside of cell
        if(i==n || j==m){
            return 0;
        }
        // No paths available so don't move At (2,2)
        if(i==n-1 && j==m-1){
            return 1;
        }
        // Move downwards
        int downPaths=countPaths(i+1,j,n,m);
        // Move right
        int rightPaths=countPaths(i,j+1,n,m);
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalPaths=countPaths(0,0,n,m);
        System.out.println(totalPaths);
    }
}
// T.C -> O(2^n)
// S.C -> O(n+m)