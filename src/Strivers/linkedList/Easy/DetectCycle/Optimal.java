package Strivers.linkedList.Easy.DetectCycle;

import Strivers.linkedList.model.ListNode;

import java.util.HashSet;

public class Optimal {
    static ListNode insertNode(ListNode head,int val) {
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

    //utility function to create cycle
    static void createCycle(ListNode head, int a, int b) {
        int cnta = 0,cntb = 0;
        ListNode p1 = head;
        ListNode p2 = head;
        while (cnta != a || cntb != b) {
            if (cnta != a) {
                p1 = p1.next;
                ++cnta;
            }
            if (cntb != b) {
                p2 = p2.next;
                ++cntb;
            }
        }
        p2.next = p1;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);

        createCycle(head,1,3);

        if(cycleDetect(head) == true)
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");
    }

    static boolean cycleDetect(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
