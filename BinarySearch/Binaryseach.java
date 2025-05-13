package BinarySearch;
public class Binaryseach {
    public static void main(String[] args) {
    int arr[]= {10,23,46,46,50,84,91};
        int n =arr.length;
        int target =44;
        int lo=0;
        int hi=n-1;
        Boolean flag=false;
        while (lo<=hi) {
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
        }
        if(flag==true)System.out.println("target present");
        else System.out.println("target not found");
    }
}
