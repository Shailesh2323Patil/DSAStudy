package Strivers.linkedList.Medium.RotateLinkedList;

import Strivers.linkedList.model.ListNode;

public class OptimalApproach {
    //utility function to insert ListNode at the end of the list
    static ListNode insertNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }

    //utility function to print list
    static void printList(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);

    }

    public static void main(String args[]) {
        ListNode head = null;
        //inserting ListNode
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);
        head=insertNode(head,5);

        System.out.println("Original list: ");
        printList(head);

        int k = 3;
        ListNode newHead = rotateRight(head,k);//calling function for rotating right of the nodes by k times

        System.out.println("After "+k+" iterations: ");
        printList(newHead);//list after rotating nodes
    }

    static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        temp.next = head;

        k = k % length;

        int end = length - k;

        while (end != 0) {
            end--;
            temp = temp.next;
        }

        head = temp.next;

        temp.next = null;

        return head;
    }
}
