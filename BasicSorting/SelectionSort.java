package BasicSorting;
public class SelectionSort {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
            System.out.println();
        }
    public static void swap(int[] arr ,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
    public static void main(String[] args) {
        int[] arr={-6,7,4,1,-9,-4,6};
        int n=arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int minindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j] < min){
                    min=arr[j];
                    minindx=j;
                }
            }
            swap( arr,i ,minindx);
        }
        print(arr);
    }
}
