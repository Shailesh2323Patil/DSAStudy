package Strivers.linkedList.Medium.Plindrome;

import Strivers.linkedList.model.ListNode;
import Strivers.stack_queue.Model.Stack;

public class PalindromeBruteForceStack {
    // Function to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

    public static Boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack stack = new Stack();

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if(temp.val != stack.top()) {
                return false;
            }

            stack.pop();

            temp = temp.next;
        }

        return true;
    }
}
