package Strivers.linkedList.Learn.SinglyLinkedList;

public class LengthLinkedList {
    public static void main(String[] args) {
        int[]arr={2,5,8,7};
        Node head = new Node(arr[0]);
        head.next= new Node(arr[1]);
        head.next.next= new Node(arr[2]);
        head.next.next.next= new Node(arr[3]);
        // Print the length of the linked list
        System.out.println(lengthOfLL(head));
    }

    public static int lengthOfLL(Node head) {
        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }
}
