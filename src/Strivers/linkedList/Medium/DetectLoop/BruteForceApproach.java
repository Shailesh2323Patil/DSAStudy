package Strivers.linkedList.Medium.DetectLoop;

import Strivers.linkedList.model.ListNode;

import java.util.HashSet;

public class BruteForceApproach {
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

        ListNode nodeReceive = detectCycle(head);

        if(nodeReceive == null) {
            System.out.println("No Cycle Found");
        }
        else {
            ListNode temp = head;
            int count = 0;
            while (temp != nodeReceive) {
                count++;
                temp = temp.next;
            }

            System.out.println("Cycle Detect at "+count);
        }
    }

    static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();

        while (head != null) {
            if(hashSet.contains(head)) {
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }

        return null;
    }
}
