package MultiDimensionalArrays.MultiDimAssignment;
public class AnticlockTwoD {
public static void rotateMatrixAnticlock(int[][] matrix ) {
    int n =matrix.length;
    int m=matrix[0].length;
    for(int i=0; i<matrix.length;i++){
        for(int j=0; j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
            System.out.println();}
        //Step 1: Transpose the matrix
        for(int i=0; i<n ;i++){
            for(int j=i;j<n;j++){
                //Swap elements at(i,j) and (j,i)
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
            //reverse rows
        for(int i=0; i<n ;i++){
            for(int j=0;j<n/2;j++){
            //swap elements at (i,j) and (i,n-j-1)
            int temp =matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1]=temp;
            }
        }
    }  
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},
                         {4,5,6},
                        {7,8,9}};
      
        rotateMatrixAnticlock(matrix);
        //print rotated matrix
        System.out.println("result is ");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
               
                System.out.print(matrix[i][j]+" ");
            }
                System.out.println();
        }
    }
}
