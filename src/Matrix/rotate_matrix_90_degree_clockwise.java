package Matrix;

public class rotate_matrix_90_degree_clockwise {
    public static int[][] rotateClockwise(int[][] matrix){
        int n=matrix.length;
        // Transpose matrix: swapping its rows with columns
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // Reverse each rows
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
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
        System.out.println("Rotated matrix by 90 degree clockwise:");
        int[][] rotatedMatrix=rotateClockwise(matrix);
        for(int i=0;i<rotatedMatrix.length;i++){
            for(int j=0;j<rotatedMatrix[i].length;j++){
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// T.C -> O(n^2) where n= dimension of the matrix
// we need to traverse the matrix twice (once for transposing and once for reversing rows)
// S.C -> O(1) since the rotation is done in place, without using extra space

// Original matrix:
// 1 2 3
// 4 5 6
// 7 8 9
// Transpose matrix:
// 1 4 7
// 2 5 8
// 3 6 9
// Reverse each rows:
// 7 4 1
// 8 5 2
// 9 6 3