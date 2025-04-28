package MultiDimensionalArrays.MultiDimAssignment;
public class Maximumsumofrow {
    public static void main(String[] args) {
        int[][] a={{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9} }; 
       int summax=Integer.MIN_VALUE;
       int maxrow=0;
       for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[0].length;j++){
                sum += a[i][j];
                if(sum>summax){
                   summax=sum;
                   maxrow=i+1;
                }
                System.out.print(a[i][j] +" ");
            }
                System.out.println();
        }
        System.out.println( "marrow is"+ maxrow+" ");
    }
}

