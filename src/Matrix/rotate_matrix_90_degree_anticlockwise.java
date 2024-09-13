package Matrix;

public class rotate_matrix_90_degree_anticlockwise {
    public static int[][] rotateAnticlockwise(int[][] matrix){
        int n=matrix.length;
        // Transpose matrix: swapping its rows with columns
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Reverse each columns
        for(int i=0;i<n;i++){
            int top=0;
            int bottom=n-1;
            while(top<bottom){
                int temp=matrix[top][i];
                matrix[top][i]=matrix[bottom][i];
                matrix[bottom][i]=temp;
                top++;
                bottom--;
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
        System.out.println("Rotated matrix by 90 degree anticlockwise:");
        int[][] rotatedMatrix=rotateAnticlockwise(matrix);
        for(int i=0;i<rotatedMatrix.length;i++){
            for(int j=0;j<rotatedMatrix[i].length;j++){
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// Original matrix:
// 1 2 3
// 4 5 6
// 7 8 9
// Transpose matrix:
// 1 4 7
// 2 5 8
// 3 6 9
// Reverse each rows:
// 3 6 9
// 2 5 8
// 1 4 7