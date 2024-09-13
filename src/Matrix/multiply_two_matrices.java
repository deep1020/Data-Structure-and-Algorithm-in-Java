package Matrix;

public class multiply_two_matrices {
    public static int[][] mulMat(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        // Check if matrices can be multiplied
        if (cols1 != mat2.length) {
            throw new IllegalArgumentException("Number of columns in first matrix must equal number of rows in second matrix");
        }
        int[][] result = new int[rows1][cols2];
        for (int i=0;i<rows1;i++) {
            for (int j=0;j<cols2;j++) {
                for (int k=0;k<cols1;k++) {
                    result[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = mulMat(mat1, mat2);
        // Print the result
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// Given Matrix Dimensions:
// mat1 is a 2x3 matrix (2 rows, 3 columns)
// mat2 is a 3x2 matrix (3 rows, 2 columns)
// Number of columns in mat1 (3) matches the number of rows in mat2 (3), so the matrices are compatible for multiplication
// For each element in the result matrix, initialize the cell to 0
// Compute the value by iterating through the row of mat1 and the column of mat2, summing the products of corresponding elements
// The error might occur if you try to multiply matrices with incompatible dimensions or access indices incorrectly.
// Ensure the matrices have compatible dimensions and that the indexing logic is correct