package Strivers.linkedList.Medium.FindInterSectionTwoLinkedList;

import Strivers.linkedList.model.ListNode;

import java.util.HashSet;

public class FindInterSectionBruteForce3 {
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

    //utility function to check presence of intersection
    static ListNode intersectionPresent(ListNode head1,ListNode head2) {
        int diff = findDifference(head1, head2);

        if(diff < 0) {
            while(diff != 0) {
                 ++diff;
                 head2 = head2.next;
            }
        }
        else if(diff > 0) {
            while (diff != 0) {
                --diff;
                head1 = head1.next;
            }
        }

        while (head1 != null) {

            if(head1 == head2) {
                return head2;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    static int findDifference(ListNode listNode1, ListNode listNode2) {
        int len1 = 0;
        int len2 = 0;

        while (listNode1 != null) {
            ++len1;
            listNode1 = listNode1.next;
        }

        while (listNode2 != null) {
            ++len2;
            listNode2 = listNode2.next;
        }

        int diff = len1 - len2;

        return diff;
    }

    //utility function to print linked list created
    static void printList(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);
    }

    public static void main(String args[]) {
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
        headSec = insertNode(headSec,3);

        ListNode head2 = headSec;
        headSec.next = head;

        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);

        //checking if intersection is present
        ListNode answerNode = intersectionPresent(head1,head2);

        if(answerNode == null) {
            System.out.println("No intersection\n");
        }
        else {
            System.out.println("The intersection point is " + answerNode.val);
        }
    }
}
