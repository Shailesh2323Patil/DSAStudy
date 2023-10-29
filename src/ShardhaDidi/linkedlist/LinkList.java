package ShardhaDidi.linkedlist;

public class LinkList {

    public Node head = null;
    private int size = 0;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
       Node newNode = new Node(data);

       size++;

       if(head == null) {
           head = newNode;
           return;
       }

       Node lastNode = head;

       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }

       lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFirst() {
        Node deleteFirst = head;

        if(deleteFirst == null) {
            System.out.println("No Data Found List is Empty");
            return;
        }

        size--;
        head = deleteFirst.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("No Data Found List is Empty");
            return;
        }

        size--;

        if(head.next == null) {
            head = null;
            System.out.println("Last Node Deleted Successfully");
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while(last.next != null) {
            secondLast = last;
            last = last.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void addDataMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        size++;

        Node newNode = new Node(data);

        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;

        for(int i = 1; i < size; i++) {
            if(i == index) {
                Node separateNode = currNode.next;

                currNode.next = newNode;
                newNode.next = separateNode;

                break;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("This");
        linkList.addLast("is");
        linkList.addLast("linked");
        linkList.addLast("list");
        linkList.addFirst("1");
        linkList.addLast("2");

        linkList.printList();

        linkList.deleteFirst();

        linkList.deleteLast();

        System.out.println(linkList.getSize());

        linkList.addDataMiddle(2, "a");

        linkList.printList();
    }
}
