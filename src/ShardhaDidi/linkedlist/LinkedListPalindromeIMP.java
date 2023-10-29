package ShardhaDidi.linkedlist;

public class LinkedListPalindromeIMP {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addFirst("1");
        linkList.addLast("2");
        linkList.addLast("3");
        linkList.addLast("4");
        linkList.addLast("3");
        linkList.addLast("2");
        linkList.addLast("1");

        LinkedListPalindromeIMP linkedListPalindrome = new LinkedListPalindromeIMP();
        System.out.println("Is Palindrome : "+linkedListPalindrome.isPalindrome(linkList.head));
    }

    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }

        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;

        while (secondHalfStart != null) {
            if(secondHalfStart.data != firstHalfStart.data) {
                return false;
            }

            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        return true;
    }

    public Node getMiddle(Node head) {
        Node fast = head;
        Node slow = head.next;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node separateNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = separateNode;
        }

        return prev;
    }
}
