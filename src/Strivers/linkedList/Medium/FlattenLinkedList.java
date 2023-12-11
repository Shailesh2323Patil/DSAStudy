package Strivers.linkedList.Medium;

public class FlattenLinkedList {
    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    static Node insertNode(int data, Node head) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.bottom != null) {
            temp = temp.bottom;
        }

        temp.bottom = newNode;

        return head;
    }

    static void printList(Node head) {
        while (head.bottom != null) {
            System.out.print(head.data+"->");
            head = head.bottom;
        }
        System.out.print(head.data);
    }

    static Node createNodeList() {
        Node head = null;
        head = insertNode(5, head);
        head = insertNode(7, head);
        head = insertNode(8, head);
        head = insertNode(10, head);

        printList(head);

        System.out.println();

        Node head2 = null;
        head2 = insertNode(10, head2);
        head2 = insertNode(20, head2);

        printList(head2);

        System.out.println();

        Node head3 = null;
        head3 = insertNode(19, head3);
        head3 = insertNode(22, head3);
        head3 = insertNode(50, head3);

        printList(head3);

        System.out.println();

        Node head4 = null;
        head4 = insertNode(28, head4);
        head4 = insertNode(35, head4);
        head4 = insertNode(40, head4);
        head4 = insertNode(45, head4);

        printList(head4);

        System.out.println();

        head.next = head2;
        head2.next = head3;
        head3.next = head4;

        return head;
    }

    public static void main(String[] args) {
        Node head = createNodeList();

        Node flatterList = flatten(head);

        printList(flatterList);

        System.out.println();
    }

    static Node flatten(Node root) {
        if(root == null || root.next == null) {
            return root;
        }

        root.next = flatten(root.next);

        root = mergeTwoList(root, root.next);

        return root;
    }

    static Node mergeTwoList(Node a, Node b) {
        Node temp = new Node(0);
        Node res = temp;

        while (a != null && b != null) {
            if(a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if(a != null) {
            temp.bottom = a;
        }
        else {
            temp.bottom = b;
        }

        return res.bottom;
    }
}














