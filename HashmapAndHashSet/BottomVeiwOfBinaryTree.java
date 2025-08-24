package HashmapAndHashSet;
import java.util.*;
public class BottomVeiwOfBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static class Pair {
        Node node;
        int level;
        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static void bottomView(Node root) {
        if (root == null) return;
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair temp = q.remove();
            Node curr = temp.node;
            int level = temp.level;
            map.put(level, curr.data);
            if (curr.left != null) q.add(new Pair(curr.left, level - 1));
            if (curr.right != null) q.add(new Pair(curr.right, level + 1));
        }
        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.right = new Node(7);
        bottomView(root);
    }
}


