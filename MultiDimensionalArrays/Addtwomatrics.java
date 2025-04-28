package MultiDimensionalArrays;
public class Addtwomatrics {
   public static void main(String[] args) {
    int[][] a= {{1,3,4},{4,3,6},{8,5,9}};
    int[][] b= {{9,30,14},{4,23,6},{18,5,19}};
    int m=a.length;
    int n=b[0].length;
    int[][] res =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+ " ");
            }
                System.out.println();
        }
    }
}