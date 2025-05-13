package BinarySearch.Assignment;
 public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,4,5}; 
        int target = 4; 
        int last = -1;
        int lo = 0, hi = arr.length - 1; 
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                last = mid;   // Possible answer
                lo = mid + 1; 
            } else if (arr[mid] < target) {
                lo = mid + 1; 
            } else {
                hi = mid - 1; 
            }
        }
        System.out.println("Last Occurrence: " + last);
    }
}
