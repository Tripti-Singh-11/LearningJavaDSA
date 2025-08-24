package HashmapAndHashSet;
import java.util.*;
public class PairSumMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //  Map to store sum -> pair that formed this sum
        Map<Integer, int[]> map = new HashMap<>();
        //  Try all pairs (i, j)
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                // Check if this sum already exists
                if (map.containsKey(sum)) {
                    int[] prevPair = map.get(sum);
                    // Check all 4 elements are distinct
                    if (prevPair[0] != arr[i] && prevPair[0] != arr[j] &&
                        prevPair[1] != arr[i] && prevPair[1] != arr[j]) {
                        System.out.println("Pairs found: ("+prevPair[0]+", "+prevPair[1]+") and ("+arr[i]+", "+arr[j]+")");
                        return;
                    }
                } else {
                    map.put(sum, new int[]{arr[i], arr[j]});
                }
            }
        }
        System.out.println("No such pairs found.");
    }
}
