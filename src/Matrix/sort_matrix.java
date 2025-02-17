package Matrix;

import java.util.Arrays;

public class sort_matrix {
    static int[][] sortMatrix(int[][] matrix){
        int n=matrix.length;
        int[] temp=new int[n*n];
        int index=0;
        // Step 1: Flatten the matrix into a 1D array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[index++]=matrix[i][j];
            }
        }
        // Step 2: Sort the 1D array
        Arrays.sort(temp);
        // Step 3: Rebuild the sorted matrix
        index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=temp[index++];
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={
                {5,4,7},
                {1,3,8},
                {2,9,6}
        };
        int[][] sortedMatrix=sortMatrix(matrix);
        for(int i=0;i<sortedMatrix.length;i++){
            for(int j=0;j<sortedMatrix[i].length;j++){
                System.out.print(sortedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
