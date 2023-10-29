package ShardhaDidi.linkedlist;

public class DeleteInputBetween1to50 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("10");
        linkList.addLast("20");
        linkList.addLast("22");
        linkList.addLast("25");
        linkList.addLast("28");
        linkList.addLast("29");
        linkList.addLast("30");
        linkList.addLast("10");
        linkList.addLast("31");
        linkList.addLast("30");
        linkList.addLast("11");

        Node previousNode = null;
        Node currNode = linkList.head;

        while (currNode != null) {
            if(Integer.parseInt(currNode.data) > 25) {
                previousNode.next = currNode.next;
            }
            else {
                previousNode = currNode;
            }
            currNode = currNode.next;
        }

        linkList.printList();
    }
}
