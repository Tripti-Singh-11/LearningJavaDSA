package BinarySearch.Assignment;
public class CountOnesInSortedBinaryArray {
public static int countOnes(int[] arr) {
    int n = arr.length;
    int low = 0, high = n - 1;
    int firstOneIndex = -1;
    while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == 1) {
        firstOneIndex = mid; 
        high = mid - 1;      
        } else {
        low = mid + 1;    
        }
    }
        if (firstOneIndex == -1) {
            return 0;
        }
        return n - firstOneIndex;
}
public static void main(String[] args) {
    int[] arr = {0, 0, 0, 0, 1, 1, 1};
    System.out.println("Total number of 1's: " + countOnes(arr));
    }
}
