package MultiDimensionalArrays.MultiDimAssignment;
public class SetZero {
    public static void main(String[] args) {
        int[][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m= matrix.length;
        int n= matrix[0].length;
        boolean zeroRow =false;
        boolean zeroCol =false;
        for(int i=0; i<n;++i){
            if(matrix[0][i]==0){
                zeroRow =true;break;
            }
        }
        for(int i=0; i<m;++i){
            if(matrix[i][0]==0){
                zeroCol =true;break;
            }
        }
        for(int i=1; i<m;++i){
            for(int j=0; j<n;++j){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][i]=0;
                }
            }
        }
        for(int i=1; i<n;++i){
            if(matrix[0][i]==0){
                for(int j=0; j<m;++j){  
                    matrix[j][i]=0;   
                }
            }
        }
        if(zeroRow=true){
            for(int i=0; i<n;++i){
                matrix[0][i]=0;
            }
        }
        if(zeroCol=true){
            for(int i=0; i<m;++i){
                matrix[i][0]=0;
            }
        }
         //print
        for(int i=0; i<m;++i){ 
            for(int j=0; j<n;++j){
                System.out.print(matrix[i][j]+ " ");
            }
                 System.out.println();
        }
    }
}





//leetcode
// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m=arr.length,n=arr[0].length;
//          boolean[] zerorow =false;
//          boolean[] zerocol =false;
//           //check 0th row
//          for(int j=0;j<n;j++){
//             if(arr[0][j]==0){
//                 zerorow=true;
//                 break;
//             }
//          }
//          //check 0th col
//          for(int i=0;i<m;i++){
//             if(arr[i][0]==0){   
//                 zerocol=true;
//                 break;
//             }
//          }
//                   //traverse in  0th row
//          for(int j=1;j<n;j++){
//             if(arr[0][j]==0){        //set jth col to 0
//                 for(int i=1;i<m;i++){   
//                     arr[i][j]=0;
//                 }
//             }
//         }
//          //traverse in 0th col
//          for(int i=1;i<m;i++){
//             if(arr[i][0]==0){
//                 for(int j=1;j<n;j++){   //set ith row to 0
//                     arr[i][j]=0;
//                 }
//             }
//         }
//         if(zerorow==true){
//             for(int j=0;j<n;j++){     //set 0th row to 0
//                 arr[0][j]=0;
//             }
//         }
//         if(zerocol==true){  //set 0th col to 0
//             for(int i=0;i<m;i++){
//                 arr[i][0]=0;
//             }
//         }
//     }
// }