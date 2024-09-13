package Matrix;

public class rotate_matrix_180_degree {
    static int[][] rotateMatrix180(int[][] matrix){
        // T.C -> O(n^2) and S.C -> O(1)
        int n=matrix.length;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i<n/2 || (i==n/2 && j<n/2)) {
                    // Swap element at (i, j) with element at (n-i-1, n-j-1)
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[n-i-1][n-j-1];
                    matrix[n-i-1][n-j-1]=temp;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Original matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated matrix by 180 degree:");
        int[][] rotatedMatrix=rotateMatrix180(matrix);
        for(int i=0;i<rotatedMatrix.length;i++){
            for(int j=0;j<rotatedMatrix[i].length;j++){
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// Optimal approach
// T.C -> O(n^2) Iterate through half of the matrix, but since the number of elements in a matrix is n^2
// So overall complexity is still proportional to the number of elements
// S.C -> O(1) we are rotating the matrix in place without using any extra space for another matrix
// 1) 2D integer array matrix[][] as input, which represents the original square matrix
// 2) Iterate through matrix, it uses two nested for loops to iterate through the elements of the matrix
// 3) The outer loop iterates over the rows (i), and the inner loop iterates over the columns (j)
// 4) Inside the loops, there is a condition to check if the current element (i, j) is in the first half of the matrix, or
// the first half of the middle row (if n is odd). This is done to avoid swapping the same elements twice
// This condition ensures that only the elements in the upper left half of the matrix (and part of the middle row) are swapped,
// as the lower right half will already be swapped when the corresponding elements are processed
// 5) For each element (i, j) that satisfies the condition, it is swapped with the element at the corresponding "mirror" position
// across the diagonal that goes from the top-left corner to the bottom-right corner of the matrix

// 2nd Approach
// T.C -> O(n^2) and S.C -> O(n^2) we are creating a new matrix to store the rotated values
//        int n=matrix.length;
//        int[][] rotated = new int[n][n];
//        // Fill the new matrix by reading the original matrix in reverse order
//        for (int i=0;i<n;i++) {
//            for (int j=0;j<n;j++) {
//                // The element at (i, j) in the rotated matrix is taken from (n-1-i, n-1-j) in the original
//                rotated[i][j]=matrix[n-1-i][n-1-j];
//            }
//        }
//        return rotated;

// 2D integer array matrix[][] as input, which represents the original square matrix
// A new matrix rotated[][] of the same size (n x n) is created to store the values of the rotated matrix.
// Two nested for loops iterate over each element in the original matrix
// outer loop iterates over the rows (i), and the inner loop iterates over the columns (j)
// This line fills the rotated[][] matrix by reversing the positions of the elements from the original matrix
// The element at (i, j) in the new rotated[][] matrix is set to the element from (n-1-i, n-1-j) in the original matrix[][]
// This mirrors the matrix elements across both diagonals, effectively rotating the matrix by 180 degrees
// For ex: Element at (0, 0) will swap with the element at (n-1, n-1), element at (0, 1) will swap with (n-1, n-2), and so on
// Finally, after filling up all the elements in the rotated[][] matrix, it is returned as the output
