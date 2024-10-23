package Strivers.linkedList.Hard;

import Strivers.linkedList.Learn.DoublyLinkedList.Node;

public class ReverseLinkedListInGroupsOfSizeK {

    public static void main(String[] args) {
        // Create a linked list with
        // values 5, 4, 3, 7, 9 and 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseKGroup(head, 2);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }

    // Function to print the linked list
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseKGroup(Node head, int k) {

        Node temp = head;

        Node prevLast = null;

        while(temp != null) {
            Node kThNode = getKThNode(temp, k);

            if(kThNode == null) {
                prevLast.next = temp;

                break;
            }

            Node nextPointer = kThNode.next;

            kThNode.next = null;

            reverseList(temp);

            if(head == temp) {
                head = kThNode;
            }
            else {
                prevLast.next = kThNode;
            }

            prevLast = temp;

            temp = nextPointer;
        }

        return head;
    }

    private static Node reverseList(Node head) {
        Node temp = head;
        Node prev = null;

        while(temp != null) {
            Node next = temp.next;

            temp.next = prev;

            prev = temp;
            temp = next;
        }

        return prev;
    }

    private static Node getKThNode(Node temp, int k) {
        k -= 1;

        while(temp != null && k > 0) {
            k--;

            temp = temp.next;
        }

        return temp;
    }

}
