package MultiDimensionalArrays;
public class TransposeOfMatrix {
    public static void print(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+ " ");
            }
                System.out.println();
        }
            System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr={{4,3,4},{5,6,7},{9,7,3}};
        int n=arr.length;
        print(arr);
        //transposing
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
        //rotate -> reverse each row
        for(int i=0;i<n;i++){
            int a=0, b=n-1;
            while(a<b){
                //swap arr[i][a] and arr[i][b]
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
}


