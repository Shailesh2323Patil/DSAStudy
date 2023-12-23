package Strivers.linkedListDoubly.LeastRecentlyUsedCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Node head = new Node(0,0);
    Node tail = new Node(0,0);

    Map<Integer, Node> map = new HashMap<>();

    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }

    private void insert(Node node) {
        map.put(node.key, node);

        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void remove(Node node) {
        map.remove(node.key);

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }

        insert(new Node(key, value));
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);

            return node.value;
        }
        else {
            return -1;
        }
    }

    public void print() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.print();

        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.print();

        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.print();

        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.print();

        System.out.println(lRUCache.get(2));    // returns -1 (not found)

        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.print();

        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
}
