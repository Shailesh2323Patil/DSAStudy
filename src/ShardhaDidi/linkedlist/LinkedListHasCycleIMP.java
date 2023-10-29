package ShardhaDidi.linkedlist;

public class LinkedListHasCycleIMP {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("2");
        linkList.addLast("3");
        linkList.addLast("4");
        linkList.addLast("3");
        linkList.addLast("2");
        linkList.addLast("1");

        LinkedListHasCycleIMP linkedListHasCycleIMP = new LinkedListHasCycleIMP();
        System.out.println("LinkedList Has Cycle : "+linkedListHasCycleIMP.hasCycle(linkList.head));
    }

    public boolean hasCycle(Node node) {
        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
