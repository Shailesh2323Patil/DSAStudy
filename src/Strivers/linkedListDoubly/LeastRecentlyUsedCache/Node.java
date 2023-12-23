package Strivers.linkedListDoubly.LeastRecentlyUsedCache;

public class Node {
    Node prev, next;
    int key, value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
