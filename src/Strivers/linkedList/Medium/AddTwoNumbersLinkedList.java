package Strivers.linkedList.Medium;

import Strivers.linkedList.model.ListNode;

public class AddTwoNumbersLinkedList {

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
        ListNode linkedList1 = null;
        linkedList1 = insertNode(1, linkedList1);
        linkedList1 = insertNode(2, linkedList1);
        linkedList1 = insertNode(3, linkedList1);

        printList(linkedList1);

        ListNode linkedList2 = null;

        linkedList2 = insertNode(4, linkedList2);
        linkedList2 = insertNode(5, linkedList2);
        linkedList2 = insertNode(6, linkedList2);

        printList(linkedList2);

        System.out.println("Add Two Numbers In LinkedList = ");

        printList(addTwoNumbers(linkedList1, linkedList2));
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.next = node;

            temp = temp.next;
        }

        return dummyNode.next;
    }
}
