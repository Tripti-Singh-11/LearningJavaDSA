package BinarySearch.Assignment;
public class BinarySearchOnArrayOfInfiniteLength {
    public static int binarySearch(int[] arr, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (arr[mid] == target) {
                return mid;  // Target found
            } else if (arr[mid] > target) {
                hi = mid - 1;  
            } else {
                lo = mid + 1; 
            }
        }
        return -1; 
    } 
    public static int findIndex(int[] arr, int target) {
        int lo = 0;
        int hi = 1;
        while (hi < arr.length && target > arr[hi]) {
            lo = hi;
            hi = 2 * hi;
            if (hi >= arr.length) {
                hi = arr.length - 1;
                break;
            }
        }
        return binarySearch(arr, target, lo, hi);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 14, 15, 17, 23, 45, 78};
        int target = 5;
        int index = findIndex(arr, target);
        if (index != -1) {
            System.out.println(  "  At index: " + index +  " Target " + target +" found");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
