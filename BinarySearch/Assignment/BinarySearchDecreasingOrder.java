package BinarySearch.Assignment;

public class BinarySearchDecreasingOrder {
    public static int searchTarget(int[] arr, int target){
        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target)  return mid;
            else if(arr[mid]>target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {114,56,44,12,4,8,6};
        int target = 12;
        System.out.println(searchTarget(arr, target));
    }
}
