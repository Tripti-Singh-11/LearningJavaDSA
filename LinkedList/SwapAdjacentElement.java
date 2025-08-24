package LinkedList;
    class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            // Swapping nodes
            first.next = second.next;
            second.next = first;
            prev.next = second;
             // Move prev to the next pair
            prev = first;
        }
         return dummy.next;
    }
    // Helper to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    // Main method to test
    public static void main(String[] args) {
        Solution obj = new Solution();
        // Test 1: [1, 2, 3, 4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original list: ");
        obj.printList(head);

        head = obj.swapPairs(head);

        System.out.print("Swapped list: ");
        obj.printList(head);
    }
}


