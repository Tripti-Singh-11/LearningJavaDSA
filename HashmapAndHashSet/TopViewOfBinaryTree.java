package HashmapAndHashSet;
import java.util.*;
public class TopViewOfBinaryTree {
    public static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Pair {
        Node node;
        int level;
        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static void TopViewNode(Node root) {
        if (root == null) return;
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int minLevel = 0, maxLevel = 0;
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair temp = q.remove();
            Node curr = temp.node;
            int level = temp.level;
            if (!map.containsKey(level)) {
                map.put(level, curr.data);
            }
            minLevel = Math.min(minLevel, level);
            maxLevel = Math.max(maxLevel, level);
            if (curr.left != null) {
                q.add(new Pair(curr.left, level - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, level + 1));
            }
        }
        for (int i = minLevel; i <= maxLevel; i++) {
            System.out.print(map.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        TopViewNode(root);
    }
}
