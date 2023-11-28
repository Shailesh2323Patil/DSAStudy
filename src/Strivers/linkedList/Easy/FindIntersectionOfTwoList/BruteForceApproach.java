package Strivers.linkedList.Easy.FindIntersectionOfTwoList;

import Strivers.linkedList.model.ListNode;

public class BruteForceApproach {

    static ListNode insertNode(ListNode head, int val) {
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

    static ListNode interSectionNode(ListNode head1, ListNode head2)
    {
        while (head2 != null)
        {
            ListNode temp = head1;
            while (temp != null)
            {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }

            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);

        ListNode head1 = head;
        head = head.next.next.next;

        ListNode headSec = null;
        headSec = insertNode(headSec, 3);

        ListNode head2 = headSec;
        headSec.next = head;

        System.out.println("List 1 : ");
        printList(head1);

        System.out.println("List 2 : ");
        printList(head2);

        ListNode answerNode = interSectionNode(head1, head2);
        if(answerNode != null) {
            System.out.println("The intersection Node = "+answerNode.val);
        }
        else {
            System.out.println("No Intersection Found");
        }
    }
}
