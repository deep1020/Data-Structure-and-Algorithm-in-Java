package Searching_and_Sorting;

public class search_position_in_matrix {
    public static int[] searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = n-1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row+1, col+1};
            } else if (matrix[row][col] < target) {
                row++; // Move right
            } else {
                col--; // Move down
            }
        }
        // If target is not found
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int matrix[][]={ { 10, 20, 30, 40 },
                         { 15, 25, 35, 45 },
                         { 27, 29, 37, 48 },
                         { 32, 33, 39, 50 } };
        int target=39;
        int result[]=searchMatrix(matrix,target);
        System.out.println(target+" is found at "+result[0]+" row and "+result[1]+" column");
    }
}
