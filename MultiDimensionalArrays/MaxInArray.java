package MultiDimensionalArrays;
public class MaxInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,3},{5,6,7}};
        int max=Integer.MIN_VALUE;
        int m =arr.length;
        int n =arr[0].length;
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,arr[i][j]);
                sum+= arr[i][j];
            }
        }
        System.out.println(max);
        System.out.println(sum);
    }
}
