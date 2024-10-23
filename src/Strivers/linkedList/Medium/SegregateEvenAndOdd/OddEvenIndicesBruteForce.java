package Strivers.linkedList.Medium.SegregateEvenAndOdd;

import Strivers.linkedList.model.ListNode;

import java.util.ArrayList;

public class OddEvenIndicesBruteForce {

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

        printNode(head);

        head = oddEvenList(head);
        printNode(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ArrayList<Integer> array = new ArrayList();

        ListNode temp = head;

        while(temp != null && temp.next != null) {
            array.add(temp.val);
            temp = temp.next.next;
        }

        if(temp != null) {
            array.add(temp.val);
        }

        temp = head.next;

        while(temp != null && temp.next != null) {
            array.add(temp.val);
            temp = temp.next.next;
        }

        if(temp != null) {
            array.add(temp.val);
        }

        temp = head;

        int i = 0;
        while(temp != null) {
            temp.val = array.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}
