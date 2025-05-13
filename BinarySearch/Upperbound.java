package BinarySearch;
public class Upperbound {
    public static void main(String[] args) {
        int arr[]= {10,23,46,46,50,84,91};
        int n =arr.length;
        int target =46;
        int lo=0;
        int hi=n-1;
        int LowerBound=n;
        while (lo<=hi) {
            int mid =lo+(hi-lo)/2;
            if(arr[mid]>target){
                LowerBound=Math.min(LowerBound,mid);
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
                System.out.println(LowerBound);
    }
    
}
