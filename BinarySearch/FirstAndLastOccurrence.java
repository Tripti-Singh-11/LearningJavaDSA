package BinarySearch;
public class FirstAndLastOccurrence {
        public static void main(String[] args) {
            int[] arr = {2, 4, 4, 4, 6, 7, 8, 8, 10}; 
            int target = 4; 
            int first = -1;
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    first = mid; 
                    hi = mid - 1;
                } else if (arr[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1; 
                }
            }
    
            // Finding Last Occurrence (Upper Bound)
            int last = -1;
            lo = 0; hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    last = mid;   
                    lo = mid + 1;
                } else if (arr[mid] < target) {
                    lo = mid + 1; 
                } else {
                    hi = mid - 1;
                }
            }
    
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }
    

