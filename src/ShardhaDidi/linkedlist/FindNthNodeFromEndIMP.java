package ShardhaDidi.linkedlist;

public class FindNthNodeFromEndIMP {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("2");
        linkList.addLast("3");
        linkList.addLast("4");
        linkList.addLast("5");
        linkList.addLast("6");
        linkList.addLast("7");

        int position = 5;

        removeNthNodeFromEnd(linkList.head, position);

        linkList.printList();
    }

    public static Node removeNthNodeFromEnd(Node head, int position) {

        if(head.next == null) {
            System.out.println("Empty List");
            return head;
        }

        int size = 0;

        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //removing SIZEth node from last i.e. head
        if(position == size) {
            return head.next;
        }

        int ptf = size - position; // Position to Find
        int check = 1;
        Node prev = head;

        while(ptf != check) {
            prev = prev.next;
            check++;
        }

        prev.next = prev.next.next;

        return head;
    }
}
