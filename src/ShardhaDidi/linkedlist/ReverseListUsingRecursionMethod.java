package ShardhaDidi.linkedlist;

public class ReverseListUsingRecursionMethod {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("2");
        linkList.addLast("3");

        linkList.printList();

        linkList.head = reverseListRecursive(linkList.head);

        linkList.printList();
    }

    public static Node reverseListRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
