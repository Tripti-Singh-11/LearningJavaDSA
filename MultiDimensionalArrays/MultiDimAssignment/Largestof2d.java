package MultiDimensionalArrays.MultiDimAssignment;
import java.util.*;
public class Largestof2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter coloumn");
        int coloumn=sc.nextInt();
        int[][] res=new int[row][coloumn];
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print("enter element[" +i+ "]+ [ "+ j +" ]");
                res[i][j]=sc.nextInt();
            }
        }
         int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                if(res[i][j]>max){
                    max=res[i][j];
                }
            }
        }
        System.out.print("largest element is"+ max+" ");
    }
}