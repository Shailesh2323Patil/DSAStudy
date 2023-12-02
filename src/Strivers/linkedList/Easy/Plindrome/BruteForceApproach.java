package Strivers.linkedList.Easy.Plindrome;

import Strivers.linkedList.model.ListNode;

import java.util.ArrayList;

public class BruteForceApproach {

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

    static boolean isPalindrome(ListNode head) {
        ArrayList arrayList = new ArrayList();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < arrayList.size()/2; i++) {
            if(arrayList.get(i) != arrayList.get(arrayList.size() - i - 1)) {
                return false;
            }
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

        printNode(head);

        Boolean isPalindrome = isPalindrome(head);

        if(isPalindrome) {
            System.out.println("Node is Palindrome");
        }
        else {
            System.out.println("Node is not Palindrome");
        }
    }
}
