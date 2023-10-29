package ShardhaDidi.linkedlist;

public class ReverseListThroughIterativeMethod {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("2");
        linkList.addLast("3");
        linkList.addLast("4");
        linkList.addLast("5");

        linkList.printList();

        linkList.head = reverseList(linkList.head);

        linkList.printList();
    }

    public static Node reverseList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            Node separate = curr.next;

            curr.next = prev;
            prev = curr;
            curr = separate;
        }

        head.next = null;
        head = prev;

        return head;
    }
}
