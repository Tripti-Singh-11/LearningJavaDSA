package LinkedList;
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindLoopLenthInCircularLL {
    // Function to find length of loop
    public static int findLoopLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Step 1: Detect loop using Floyd's algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
             // Loop detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        // No loop
        return 0;
    }
    // Count number of nodes in loop
    private static int countLoopLength(ListNode nodeInLoop) {
        ListNode temp = nodeInLoop;
        int count = 1;
        while (temp.next != nodeInLoop) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    // Test the function
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        int loopLength = findLoopLength(head);
        System.out.println("Loop Length = " + loopLength);  
    }
}


