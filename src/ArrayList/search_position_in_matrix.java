package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class search_position_in_matrix {
    public static List<Integer> searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Start from the top-left corner
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                List<Integer> result = new ArrayList<>();
                result.add(row + 1); // Adjust row and column indices to 1-based indexing
                result.add(col + 1);
                return result;
            } else if (matrix[row][col] < target) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }
        // If target is not found
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int matrix[][]={ { 10, 20, 30, 40 },
                         { 15, 25, 35, 45 },
                         { 27, 29, 37, 48 },
                         { 32, 33, 39, 50 } };
        int target=39;
        List<Integer> result=searchMatrix(matrix,target);
        System.out.println(result);
        System.out.println(target+" is found at "+result.get(0)+" row and "+result.get(1)+" column");
    }
}
