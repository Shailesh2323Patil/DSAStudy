package Strivers.linkedList.Medium.DetectLoop;

import Strivers.linkedList.model.ListNode;

public class OptimalApproach {

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

    static void createCycle(ListNode head,int pos) {
        ListNode ptr = head;
        ListNode temp = head;
        int cnt = 0;
        while(temp.next != null) {
            if(cnt != pos) {
                ++cnt;
                ptr = ptr.next;
            }
            temp = temp.next;
        }
        temp.next = ptr;
    }

    public static void main(String[] args) {
        ListNode head = null;

        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);
        head=insertNode(head,3);
        head=insertNode(head,6);
        head=insertNode(head,10);

        createCycle(head,2);

        ListNode nodeReceive = detectNode(head);

        if(nodeReceive == null) {
            System.out.println("No Cycle Detect");
        }
        else {
            int pos = 0;
            while (nodeReceive != head) {
                head = head.next;
                pos++;
            }

            System.out.println("Cycle Detect At "+pos);
        }
    }

    static ListNode detectNode(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }

        return null;
    }
}
