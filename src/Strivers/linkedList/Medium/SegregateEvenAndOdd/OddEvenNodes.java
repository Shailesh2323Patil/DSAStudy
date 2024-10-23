package Strivers.linkedList.Medium.SegregateEvenAndOdd;

import Strivers.linkedList.model.ListNode;

public class OddEvenNodes {

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

    static void printNode(ListNode head) {
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

        printNode(head);

        head = oddEvenList(head);
        printNode(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode evenHead = new ListNode(-1), evenTail = evenHead;
        ListNode oddHead = new ListNode(-1), oddTail = oddHead;

        ListNode curr = head;
        ListNode temp = null;

        while (curr != null) {
            temp = curr;
            curr = curr.next;

            temp.next = null;

            if(temp.val % 2 == 0) {
                evenTail.next = temp;
                evenTail = temp;
            }
            else {
                oddTail.next = temp;
                oddTail = temp;
            }
        }

        evenTail.next = oddHead.next;

        return evenHead.next;
    }
}
