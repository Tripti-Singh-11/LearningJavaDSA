package BasicSorting.Assignment;
import java.util.Arrays;
public class KthSmallest {
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("Sorted elements"+ " "+ Arrays.toString(arr));
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest);
    } 
}


