package HashmapAndHashSet;
import java.util.*;
public class MaxVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] votes = new String[n];
        System.out.println("Enter names of candidates:");
        for (int i = 0; i < n; i++) {
            votes[i] = sc.nextLine();
        }
        //  Count votes using HashMap
        HashMap<String, Integer> voteMap = new HashMap<>();
        for (String name : votes) {
            voteMap.put(name, voteMap.getOrDefault(name, 0) + 1);
        }
        //  Find candidate with max votes
        String winner = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            String candidate = entry.getKey();
            int count = entry.getValue();
             if (count > maxVotes || (count == maxVotes && candidate.compareTo(winner) < 0)) {
                winner = candidate;
                maxVotes = count;
            }
        }
        System.out.println("Winner is: " + winner);
    }
}

