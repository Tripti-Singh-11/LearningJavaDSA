package MultiDimensionalArrays.MultiDimAssignment;
public class DiagonalOfSquare {
    public static void main(String[] args) {
    int[][] arr={{2,2,3},
                 {4,5,6},
                 {7,8,9}};
    int n=arr.length; int m=arr[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
            System.out.println();
            }
            System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if ((i==j)||(i+j==n-1)) {
                System.out.print(arr[i][j]+" ");
            }
            else 
            System.out.print(" "+" ");
        }
            System.out.println();
    }
            System.out.println();
            int suml=0;int sumr=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((i==j)) {
                        suml=suml+arr[i][j]; 
                    }
                    if(i+j==n-1){
                        sumr+=arr[i][j];
                    }
                }
            }
            System.out.println("sum of left diagonal"+""+suml);
            System.out.println("sum of right diagonal"+""+sumr);
    }
}
