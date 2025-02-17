package Matrix;

public class find_peak_element_in_matrix {
    static int findPeakElement(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int leftCol=0;
        int rightCol=cols-1;
        while(leftCol<=rightCol){
            int midCol=leftCol+(rightCol-leftCol)/2;
            int maxRow=0;
            for(int i=0;i<rows;i++){
                if(matrix[i][midCol]>matrix[maxRow][midCol]){
                    maxRow=i;
                }
            }
            int midMax=matrix[maxRow][midCol];
            boolean isLeftSmaller=(midCol==0 || matrix[maxRow][midCol]>=matrix[maxRow][midCol-1]);
            boolean isRightSmaller=(midCol==cols-1 || matrix[maxRow][midCol]>=matrix[maxRow][midCol+1]);
            if(isLeftSmaller && isRightSmaller){
                return midMax;
            }
            if(midCol>0 && matrix[maxRow][midCol]<matrix[maxRow][midCol-1]){
                rightCol=midCol-1;
            }
            else{
                leftCol=midCol+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,15},{30,21,14},{7,16,32}};
        System.out.println("Find maximum element in a matrix: "+findPeakElement(matrix));
    }
}
// T.C -> O(nlogm) where n= number of rows and m= number of columns
// Performing binary search on the columns (log m), and for each column, we scan all the rows O(n).
// S.C -> O(1): No extra space is used apart from a few variables.

// Steps:
// perform a binary search over the columns of the matrix (leftCol and rightCol)
// In each iteration, we find the middle column (midCol) and look for the maximum element in that column.
// For the current middle column, we scan through all rows and find the row (maxRow) where the element is the largest.
// We check whether the maximum element in the middle column is a peak:
// It is a peak if it is larger than (or equal to) both its left and right neighbors (if they exist).
// If the element to the left of the maximum is greater than the maximum, we move to the left half (rightCol = midCol - 1).
// If the element to the right of the maximum is greater, we move to the right half (leftCol = midCol + 1).
