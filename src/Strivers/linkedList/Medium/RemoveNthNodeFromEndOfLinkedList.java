package Strivers.linkedList.Medium;

import Strivers.linkedList.model.ListNode;

import java.util.List;

public class RemoveNthNodeFromEndOfLinkedList {

    static ListNode insertNode(int val, ListNode head) {
        ListNode newNode = new ListNode(val);

        if(head == null) {
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static void printList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = insertNode(1, head);
        head = insertNode(2, head);
        head = insertNode(3, head);
        head = insertNode(4, head);
        head = insertNode(5, head);
        head = insertNode(6, head);

        printList(head);

        int n = 3;

        System.out.println("Remove "+n+"th Node from the End");

        printList(removeNthNode(head, n));
    }

    static ListNode removeNthNode(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;

        ListNode slow = start;
        ListNode fast = start;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}
