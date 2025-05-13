package MultiDimensionalArrays.MultiDimAssignment;
import java.util.Scanner;
public class Spiraltype {
public static void main(String[] args) {
   int[][] arr=new int[3][3];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
         arr[i][j]=sc.nextInt(); 
      }
      System.out.println();
   } 
   int minr=0,maxr=3-1,minc=0,maxc=3-1;
while((minr<=maxr)&&(minc<=maxc)){
   //left to right
   for(int j=minc;j<=maxc;j++){
      System.out.print(arr[minr][j]+" ");
   }
      minr++;
   if((minr>maxr)||(minc>maxc))
      break;
   //top to bottem
   for(int i=minr;i<=maxr;i++){
      System.out.print(arr[i][maxc]+" ");
   }
      maxc--;
   if((minr>maxr)||(minc>maxc))
      break;
   //right to left
   for(int j=maxc;j>=minc;j--){
      System.out.print(arr[maxr][j]+" ");
   }
      maxr--;
      //bottom to top
   if((minr>maxr) || (minc>maxc))
      break;
      for(int i=maxr;i>=minr;i--){
         System.out.print(arr[i][minc]+" ");
      }
         minc++;                                   
}
}
}




























































  
