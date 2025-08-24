package HashmapAndHashSet;
import java.util.*;
public class CopyRandomList {
    
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) return null;

            // Step 1: Create deep copy list without randoms
            Node head2 = new Node(head.val);
            Node temp2 = head2;
            Node temp = head.next;

            while (temp != null) {
                Node dup = new Node(temp.val);
                temp2.next = dup;
                temp2 = dup;
                temp = temp.next;
            }

            // Step 2: Map original nodes to their copies
            HashMap<Node, Node> map = new HashMap<>();
            temp2 = head2;
            temp = head;
            while (temp != null) {
                map.put(temp, temp2);
                temp = temp.next;
                temp2 = temp2.next;
            }

            // Step 3: Set random pointers using map
            for (Node original : map.keySet()) {
                Node duplicate = map.get(original);
                if (original.random != null) {
                    duplicate.random = map.get(original.random);
                }
            }
            return head2;
        }
    }

    public static void main(String[] args) {
        // Create original list
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        // Link next pointers
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Link random pointers
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        // Run deep copy
        Solution sol = new Solution();
        Node copiedHead = sol.copyRandomList(a);

        // Print copied list
        Node temp = copiedHead;
        System.out.println("Copied List:");
        while (temp != null) {
            int randVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Node val: " + temp.val + ", Random points to: " + randVal);
            temp = temp.next;
        }
    }
}
