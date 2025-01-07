package MultiDimensionalArrays;
public class Largestelement {
    public static void main(String[] args) {
        int[] arr={4,8,5,9};
        int n=arr.length;
        int max= Integer.MIN_VALUE;
        int[] ans= new int[n];
        ans[n-1] =-1;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,arr[i]);
            for(int j=i+1;j<n-1;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
            for(int ele : arr){
                System.out.print(ele+ " ");
            }
                System.out.println();
                for(int ele: ans){
                    System.out.print(ele+ " ");
                }
    }
}
