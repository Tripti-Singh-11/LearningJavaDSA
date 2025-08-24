package HashmapAndHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountDistinct {
   public static List<Integer> countDistinct(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // Add current element to frequency map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

            // Remove the element going out of the window
            if (i >= k) {
                int outElem = arr[i - k];
                if (freqMap.get(outElem) == 1) {
                    freqMap.remove(outElem);
                } else {
                    freqMap.put(outElem, freqMap.get(outElem) - 1);
                }
            }

            // From index (k-1), we start recording results
            if (i >= k - 1) {
                result.add(freqMap.size());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter size of array (N): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (K): ");
        int k = sc.nextInt();

        List<Integer> ans = countDistinct(arr, k);

        System.out.println("Distinct elements count in each window:");
        for (int val : ans) {
            System.out.print(val + " ");
        }

        sc.close();
    } 
}
