package BasicSorting;
public class SortInDecreasingOrder {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
            System.out.println();
        }
    public static void main(String[] args) {
        int[] arr={-6,7,4,1,-9,-4,6};
        int n=arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j] > max){
                    max=arr[j];
                    maxindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxindx];
            arr[maxindx]=temp;      
        }
        print(arr);
    }
}
