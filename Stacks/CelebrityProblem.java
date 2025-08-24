package Stacks;
import java.util.Stack;
public class CelebrityProblem {
    public static int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
         //  Push all people into stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        //  Eliminate using comparison
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (M[v1][v2] == 0) {
                // v1 does not know v2 → v1  celebrity
                st.push(v1);
            } else {
                // v1 knows v2 → v1 can't be celebrity, maybe v2
                st.push(v2);
            }
        }
         // Check if potential celebrity is valid
        if (st.isEmpty()) return -1;
        int potential = st.pop();
        //  Row Check: potential should not know anyone
        for (int j = 0; j < n; j++) {
            if (M[potential][j] == 1 && j != potential) {
                return -1; // candidate knows someone → not celebrity
            }
        }
        //  Column Check: everyone should know potential
        for (int i = 0; i < n; i++) {
            if (M[i][potential] == 0 && i != potential) {
                return -1; // someone doesn't know candidate → not celebrity
            }
        }
        return potential;
    }
    public static void main(String[] args) {
        int[][] M = {
            {0, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };
        int n = 3;
        int celebrity = celebrity(M, n);
        if (celebrity == -1)
            System.out.println("No celebrity");
        else
            System.out.println("celebrity is person: " + celebrity);
    }
}
