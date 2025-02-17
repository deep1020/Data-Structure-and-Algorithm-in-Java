package Dynamic_Programming;

public class find_size_of_largest_square_in_2D_square_matrix {
    static int findLargestSquareSize(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] dp=new int[rows+1][cols+1];
        int maxSize=0;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(matrix[i-1][j-1]==1){
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    maxSize=Math.max(maxSize,dp[i][j]);
                }
            }
        }
        return maxSize;
    }
    public static void main(String[] args) {
        int[][] matrix={
                {1,1,1,1,1},
                {1,1,1,0,0},
                {1,1,1,0,0},
                {1,1,1,0,0},
                {1,1,1,1,1}
        };
        System.out.println(findLargestSquareSize(matrix));
    }
}
// 1) Initialization:
// - matrix is a 2D array of size rows and cols
// - create a dp array with an extra row and column (rows + 1 by cols + 1) to simplify boundary conditions.
// This allows us to avoid checking for index out-of-bound issues when looking at the previous row/column or diagonal.
// - Initialize maxSize to 0 to keep track of the largest square's size found in the matrix.
// 2) Filling DP table:
// - The outer loop (i) runs through all rows of the matrix from 1 to rows, and the inner loop (j) runs through all columns from 1 to cols.
// - When matrix[i-1][j-1] == 1, it means that this cell could potentially be part of a square of 1s.
// - The size of the square ending at the cell (i-1, j-1) in the matrix is determined by looking at its neighbors:
// - The diagonal cell (dp[i-1][j-1]), top cell (dp[i-1][j]), and left cell (dp[i][j-1]).
// - Minimum of these three values is taken because a square can only be formed if all these neighbors also form squares of 1s.
// - Then 1 is added to the minimum value to account for the current cell itself.
// - dp[i][j] value is updated to reflect the largest square that ends at the current cell (i, j).
// - If a new larger square is found, maxSize is updated to store the maximum size.
// 3) Final Result:
// - After the entire DP table is filled, maxSize contains the size of the largest square of 1s found in the matrix.

// T.C -> O(m*n) where m= number of rows and n= number of columns
// Outer loop runs each row of matrix exactly once and inner loop runs each column exactly once in a matrix.
// Since there are two nested loops (over rows and columns), the overall time complexity is O(m*n).
// S.C -> O(m*n)
// dp table is of size (rows+1) * (cols+1). Here the additional space used is the DP array, which is proportional to the size of the matrix O(m*n).
