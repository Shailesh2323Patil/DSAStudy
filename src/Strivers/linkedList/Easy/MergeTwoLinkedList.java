package Strivers.linkedList.Easy;

import Strivers.linkedList.model.ListNode;

public class MergeTwoLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        ListNode node2 = new ListNode(8, node);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(3, node3);

        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(7, node5);
        ListNode node7 = new ListNode(5, node6);

        ListNode data = mergeTwoLists(node4, node7);

        while (data != null) {
            System.out.print(data.val +" ");
            data = data.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        if(l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNode res = l1;

        while (l1 != null && l2 != null) {
            ListNode tmp = null;

            while (l1 != null && l1.val <= l2.val) {
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;

            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        return res;
    }
}
