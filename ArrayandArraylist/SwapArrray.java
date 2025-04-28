package ArrayandArraylist;
public class SwapArrray {
    public static void Swap(int[] arr,int  mid, int lo) {
        int temp=arr[mid];
        arr[mid]=arr[lo];
        arr[lo] = temp;
    }
    public static void main(String Args[]) {
        int[] arr={ 0,1,0,2,2,0,2,1,0,1};
        int n =arr.length;
        int mid =0,hi = n-1,lo=0;
        while(mid<=hi){
            if(arr[mid]==0){
                Swap(arr,mid,lo);
                lo++;mid++;

            }
            else if(arr[mid]==1) mid++;
            else{
                Swap(arr,mid,hi);
                hi--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        
    }
    
}
