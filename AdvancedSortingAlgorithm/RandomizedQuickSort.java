package AdvancedSortingAlgorithm;
public class RandomizedQuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi) {
        int pivotIndx = lo + (hi - lo) / 2; // middle element as pivot
        int pivotEle = arr[pivotIndx];
        int cntSmaller = 0;
        for (int i = lo; i <= hi; i++) {
            if (i != pivotIndx && arr[i] <= pivotEle) {
                cntSmaller++;
            }
        }
        int correctIndx = lo + cntSmaller;
        swap(arr, pivotIndx, correctIndx);
        int i = lo;
        int j = hi;
        while (i < correctIndx && j > correctIndx) {
            if (arr[i] <= arr[correctIndx]) {
                i++;
            } else if (arr[j] > arr[correctIndx]) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIndx;
    }
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int pivotPos = partition(arr, lo, hi);
        quickSort(arr, lo, pivotPos - 1);
        quickSort(arr, pivotPos + 1, hi);
    }
    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        System.out.print("Before sorting: ");
        print(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.print("After :  ");
        print(arr);
    }
}
