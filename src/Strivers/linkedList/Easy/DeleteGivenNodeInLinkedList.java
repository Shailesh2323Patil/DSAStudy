package Strivers.linkedList.Easy;

import Strivers.linkedList.model.ListNode;

public class DeleteGivenNodeInLinkedList {
    public static void main(String[] args) {
        ListNode head = null;
        head = insertNode(1,head);
        head = insertNode(2,head);
        head = insertNode(3,head);
        head = insertNode(4,head);
        head = insertNode(5,head);
        head = insertNode(6,head);
        head = insertNode(7,head);

        System.out.println("Linked List : ");
        printList(head);

        System.out.println("Node to be Deleted : ");
        ListNode temp = getNode(head, 4);

        printList(temp);

        System.out.println("After Deletion : ");
        deleteNode(temp);

        printList(head);
    }

    static ListNode insertNode(int num, ListNode head) {
        ListNode newNode = new ListNode(num);

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
        while(head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(head.val);
    }

    static ListNode getNode(ListNode head, int num) {
        if(head == null) {
            return head;
        }

        while (head.val != num) {
            head = head.next;
        }

        return head;
    }

    static void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
