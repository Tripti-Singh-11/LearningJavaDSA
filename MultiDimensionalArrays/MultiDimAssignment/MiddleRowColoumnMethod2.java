package MultiDimensionalArrays.MultiDimAssignment;
import java.util.Scanner;
public class MiddleRowColoumnMethod2 {
public static void main(String[] args) {
    int[][] array={ {1,2,3,5,8},{6,3,5,9,8},{3,7,4,9,7},{2,6,9,7,5},{8,7,7,9,2} };
    displayMiddleRowColoumn(array,5);
}
public static void displayMiddleRowColoumn(int[][] array,int size) {
    for(int j=0;j<size;j++){
        for(int i=0;i<size;i++){
            System.out.print(array[j][i]+ " "); 
        }
            System.out.println();
    }
        int middleIndex=size/2;                                               //this will give index of middle row and column
        //Display middle row 
        System.out.print("Middle row"+"  ");
            for(int j=0;j<size;j++){
                System.out.print(array[middleIndex][j]+" ");
            }   System.out.println();
                //Display middle coloumn
                System.out.print("middle coloumn"+"  ");
                for(int i=0;i<size;i++){
                    System.out.print(array[i][middleIndex]+" ");
                }
                System.out.println();
}
}
