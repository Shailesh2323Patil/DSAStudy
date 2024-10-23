package Strivers.linkedList.Easy.FindMiddle;

import Strivers.linkedList.model.ListNode;

public class FindMiddleElementBrute {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2, node);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(5, node4);
        ListNode node6 = new ListNode(6, node5);

        ListNode head = node6;

        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }

        System.out.println();
        System.out.println("Middle in LinkedList = ");

        ListNode middle = middleLinkedList(node6);

        while (middle != null) {
            System.out.print(middle.val+" ");
            middle = middle.next;
        }
    }

    public static ListNode middleLinkedList(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = (count/2) + 1;

        temp = head;
        while(temp != null) {
            mid--;

            if(mid == 0) {
                break;
            }

            temp = temp.next;
        }

        return temp;
    }
}
