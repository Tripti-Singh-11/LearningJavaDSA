package MultiDimensionalArrays;
public class Spiral {
public static void print(int[][] arr) {
int m=arr.length,n=arr[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+ " ");
        }
            System.out.println();
    } 
    System.out.println();
}
    public static void main(String[] args) {
    int[][] arr={{5,9,7,3},{4,8,3,4},{2,5,6,7},{4,8,3,4}};
    int m=arr.length,n=arr[0].length;
    print(arr);
    int minr=0,maxr=n-1,minc=0,maxc=n-1;
    while((minr<=maxr)&&(minc<=maxc)){
        //left to right
        for(int j=minc;j<=maxc;j++){
            System.out.print(arr[minr][j]+" ");
        }
            minr++;
        if((minr>maxr)||(minc>maxc))break;
            //top to botte
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }   
                maxc--;
        if((minr>maxr)||(minc>maxc))break;
             //right to left
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }   
                maxr--;
            //bottom to top
        if((minr>maxr) || (minc>maxc))break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
               minc++;    
    }
}
}

