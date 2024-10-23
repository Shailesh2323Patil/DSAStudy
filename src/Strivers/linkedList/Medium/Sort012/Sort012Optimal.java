package Strivers.linkedList.Medium.Sort012;

import Strivers.linkedList.model.ListNode;

public class Sort012Optimal {
    static ListNode sortList(ListNode head) {
        // add your code here

        ListNode zero = new ListNode(-1);
        ListNode tempZero = zero;

        ListNode one = new ListNode(-1);
        ListNode tempOne = one;

        ListNode two = new ListNode(-1);
        ListNode tempTwo = two;

        while(head != null) {
            if(head.val == 0) {
                tempZero.next = head;
                tempZero = tempZero.next;
            }
            else if(head.val == 1) {
                tempOne.next = head;
                tempOne = tempOne.next;
            }
            else {
                tempTwo.next = head;
                tempTwo = tempTwo.next;
            }

            head = head.next;
        }

        tempZero.next = one.next;
        tempOne.next = two.next;
        tempTwo.next = null;

        head = zero.next;

        return head;
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

        head = sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
