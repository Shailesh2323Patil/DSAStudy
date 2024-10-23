package Strivers.linkedList.Medium.DeleteMiddleNode;

import Strivers.linkedList.model.ListNode;

public class DeleteMiddleNodeBruteForce {

    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;

        int cnt = 0;

        while(temp != null) {
            cnt++;
            temp = temp.next;
        }

        int res = cnt / 2;

        temp = head;

        while(temp != null) {
            res--;

            if(res == 0) {
                break;
            }

            temp = temp.next;
        }

        ListNode middle = temp.next;

        temp.next = temp.next.next;

        middle = null;

        return head;
    }

    static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle ListNode
        head = deleteMiddle(head);

        // Displaying the updated linked list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}
