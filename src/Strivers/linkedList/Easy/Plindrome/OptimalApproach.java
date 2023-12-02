package Strivers.linkedList.Easy.Plindrome;

import Strivers.linkedList.model.ListNode;

public class OptimalApproach {

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

    static ListNode reverse(ListNode ptr) {
        ListNode pre = null;
        ListNode nex = null;

        while (ptr != null) {
            nex = ptr.next;
            ptr.next = pre;
            pre = ptr;
            ptr = nex;
        }

        return pre;
    }

    static boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;

        ListNode dummy = head;

        while (slow != null) {
            if(dummy.val != slow.val) {
                return false;
            }
            dummy = dummy.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = null;

        head = insertNode(1, head);
        head = insertNode(2, head);
        head = insertNode(3, head);
        head = insertNode(2, head);
        head = insertNode(1, head);

        printList(head);
        System.out.println("");

        if(isPalindrome(head) == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
