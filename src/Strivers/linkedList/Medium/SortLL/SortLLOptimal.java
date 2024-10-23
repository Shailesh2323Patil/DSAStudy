package Strivers.linkedList.Medium.SortLL;

import Strivers.linkedList.model.ListNode;

public class SortLLOptimal {
    private static ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }

    private static ListNode findMiddle(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode sortLL(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head);

        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortLL(left);
        right = sortLL(right);

        return mergeTwoSortedLinkedLists(left, right);
    }

    private static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Linked List: 3 2 5 4 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Sort the linked list
        head = sortLL(head);

        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }
}
