package MultiDimensionalArrays;
public class RomColumn {
  public static void main(String[] args) {
    int[][] arr={{1,4},{7,8},{6,5}};
    int m=arr.length;
    int n=arr[0].length;
    for(int j=0;j<n;j++ ){                //cols
        for(int i=0;i<m;i++){            //rows
          System.out.print(arr[i][j]+ " ");
        }
          System.out.println();
    }
  }  
}

 


