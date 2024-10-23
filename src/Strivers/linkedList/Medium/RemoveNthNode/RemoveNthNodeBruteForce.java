package Strivers.linkedList.Medium.RemoveNthNode;

import Strivers.linkedList.model.ListNode;

public class RemoveNthNodeBruteForce {
    // Function to print the linked list
    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth ListNode from the end of the linked list
    public static ListNode DeleteNthNodeFromEnd(ListNode head, int N) {
       ListNode temp = head;
       Integer cnt = 0;

       while (temp != null) {
           cnt++;
           temp = temp.next;
       }

       if(cnt == N) {
           ListNode newHead = head.next;
           head = null;
           return newHead;
       }

       temp = head;
       int res = cnt - N;

       while (temp != null) {
           res--;

           if(res == 0) {
               break;
           }
           temp = temp.next;
       }

       ListNode slowP = temp;
       slowP.next = slowP.next.next;

       return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);

        // Delete the Nth ListNode from the end and print the modified linked list
        head = DeleteNthNodeFromEnd(head, N);
        printLL(head);
    }
}
