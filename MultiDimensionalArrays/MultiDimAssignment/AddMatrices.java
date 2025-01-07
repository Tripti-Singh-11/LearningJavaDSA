package MultiDimensionalArrays.MultiDimAssignment;
import java.util.*;
public class AddMatrices {
   public static void main(String[] args) {
    int[][] matrices1=new int[3][3];
    int[][] matrices2=new int[3][3];
    int[][] resultmatrices=new int[3][3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("enter elementA[" +i+ "]+ [ "+ j +" ]");
           matrices1[i][j] =sc.nextInt();
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("enter elementb[" +i+ "]+ [ "+ j +" ]");
           matrices2[i][j] =sc.nextInt();
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        resultmatrices[i][j]= matrices1[i][j] +   matrices2[i][j];
        }
    }
        System.out.println("2d result is");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(resultmatrices[i][j]+" ");
                }System.out.println();
        } 
    }
}

