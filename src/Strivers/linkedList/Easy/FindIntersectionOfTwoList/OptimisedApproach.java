package Strivers.linkedList.Easy.FindIntersectionOfTwoList;

import Strivers.linkedList.model.ListNode;


public class OptimisedApproach {

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

    static ListNode interSectionPresent(ListNode head1, ListNode head2) {
        ListNode d1 = head1;
        ListNode d2 = head2;

        while (d1 != d2) {
            d1 = d1 == null ? head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;
        }

        return d1;
    }

    static void printList(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        // creation of both lists
        ListNode head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        ListNode head1 = head;
        head = head.next.next.next;
        ListNode headSec = null;
        headSec=insertNode(headSec,3);
        ListNode head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);

        ListNode answerNode = interSectionPresent(head1, head2);

        if(answerNode == null) {
            System.out.println("No Intersection Present");
        }
        else {
            System.out.println("Intersection Present = "+answerNode.val);
        }

    }
}
