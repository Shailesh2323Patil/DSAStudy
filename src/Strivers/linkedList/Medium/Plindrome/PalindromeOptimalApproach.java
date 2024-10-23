package Strivers.linkedList.Medium.Plindrome;

import Strivers.linkedList.model.ListNode;
import Strivers.stack_queue.Model.Stack;

public class PalindromeOptimalApproach {
    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
            printLinkedList(head);
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }


    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        ListNode front = head.next;

        front.next = head;

        head.next = null;

        return newHead;
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        while (second != null) {
            if(first.val != second.val) {
                reverse(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverse(newHead);

        return true;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
