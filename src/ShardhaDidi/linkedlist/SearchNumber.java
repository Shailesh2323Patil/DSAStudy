package ShardhaDidi.linkedlist;

public class SearchNumber {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addLast("1");
        linkList.addLast("5");
        linkList.addLast("3");
        linkList.addLast("8");
        linkList.addLast("7");
        linkList.addLast("2");
        linkList.addLast("3");

        int size = linkList.getSize();

        Node curreNode = linkList.head;

        for(int i=0; i<size; i++) {

            if(curreNode.data == "7") {
                System.out.println("Index Number Of 7 is "+i);
                break;
            }

            curreNode = curreNode.next;
        }
    }
}
