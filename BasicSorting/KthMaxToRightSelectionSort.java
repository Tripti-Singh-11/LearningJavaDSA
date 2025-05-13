package BasicSorting;
public class KthMaxToRightSelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {16, 70, 44, 11, 89, 54, 66};
        int n = arr.length;
        print(arr);
        for (int i = n - 1; i > 0; i--) {
            int maxIndex = 0; 
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int k = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = k;
        }
        print(arr);
    }
}