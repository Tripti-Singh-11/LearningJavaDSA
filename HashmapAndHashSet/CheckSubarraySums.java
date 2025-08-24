package HashmapAndHashSet;
import java.util.*;
public class CheckSubarraySums {

    // Function to check if subarrays with sums X, Y, Z exist in sequence
    public static boolean isPossible(int[] A, int X, int Y, int Z) {
        int N = A.length;
        HashSet<Integer> prefixSums = new HashSet<>();
        int currSum = 0;

        for (int i = 0; i < N; i++) {
            currSum += A[i];
            prefixSums.add(currSum);
        }

        for (int sum : prefixSums) {
            int x = sum + X;
            int y = x + Y;
            int z = y + Z;
            if (prefixSums.contains(x) && prefixSums.contains(y) && prefixSums.contains(z)) {
                return true;
            }
        }
        return false;
    }

    // Main method with input handling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.print("Enter " + N + " elements of array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter value of X: ");
        int X = sc.nextInt();

        System.out.print("Enter value of Y: ");
        int Y = sc.nextInt();

        System.out.print("Enter value of Z: ");
        int Z = sc.nextInt();

        // Function call
        boolean result = isPossible(A, X, Y, Z);

        // Output result
        if (result) {
            System.out.println("YES — Subarrays with sums X, Y, Z found in order.");
        } else {
            System.out.println("NO — No such subarrays found.");
        }
        sc.close();
    }
}


