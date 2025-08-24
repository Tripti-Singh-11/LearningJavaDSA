package LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
    public class MergeNodesBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode resultTail = dummy;
        ListNode current = head.next;
        int sum = 0;
        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                resultTail.next = new ListNode(sum);
                resultTail = resultTail.next;
                sum = 0;
            }
            current = current.next;
        }
        return dummy.next; // return start of result list
    }
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] input = {0, 3, 1, 0, 4, 5, 2, 0};
        ListNode head = createList(input);
        ListNode result = mergeNodes(head);
        System.out.print("Modified List: ");
        printList(result);
    }
}
