package Strivers.linkedList.Medium.Sort012;

import Strivers.linkedList.model.ListNode;

public class Sort012BruteForce {
    static void sortList(ListNode head) {

        // Initialize count of '0', '1' and '2' as 0
        int[] cnt = { 0, 0, 0 };
        ListNode ptr = head;

        // Traverse and count total number of '0', '1' and '2'
        // cnt[0] will store total number of '0's
        // cnt[1] will store total number of '1's
        // cnt[2] will store total number of '2's
        while (ptr != null) {
            cnt[ptr.val] += 1;
            ptr = ptr.next;
        }

        int idx = 0;
        ptr = head;

        // Fill first cnt[0] ListNodes with value 0
        // Fill next cnt[1] ListNodes with value 1
        // Fill remaining cnt[2] ListNodes with value 2
        while (ptr != null) {
            if (cnt[idx] == 0)
                idx += 1;
            else {
                ptr.val = idx;
                cnt[idx] -= 1;
                ptr = ptr.next;
            }
        }
    }

    static void printList(ListNode ListNode) {
        while (ListNode != null) {
            System.out.print(" " + ListNode.val);
            ListNode = ListNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 1 -> 2 -> 1 -> 0 -> NULL
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
