package Strivers.linkedList.Medium.RemoveNthNode;

import Strivers.linkedList.model.ListNode;

public class RemoveNthNodeOptimal {
    // Function to print the linked list
    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth ListNode from the end of the linked list
    public static ListNode DeleteNthNodeFromEnd(ListNode head, int N) {
        ListNode fastP = head;
        ListNode slowP = head;

        for (int i = 0; i < N; i++) {
            fastP = fastP.next;
        }

        if(fastP == null) {
            return head.next;
        }

        while (fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next;
        }

        ListNode deleteNode = slowP.next;
        slowP.next = slowP.next.next;
        deleteNode = null;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);

        // Delete the Nth ListNode from the end and print the modified linked list
        head = DeleteNthNodeFromEnd(head, N);
        printLL(head);
    }
}
