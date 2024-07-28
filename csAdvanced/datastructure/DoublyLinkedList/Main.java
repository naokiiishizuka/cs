package csAdvanced.datastructure.DoublyLinkedList;

class Item {
    public int data;
    public Item prev;
    public Item next;

    public Item(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    public Item head;
    public Item tail;

    public DoublyLinkedList(int[] arr) {
        this.head = new Item(arr[0]);
        Item current = head;
        for(int i=1; i<arr.length; i++) {
            current.next = new Item(arr[i]);
            current.next.prev = current;
            current = current.next;
        }
        this.tail = current;
    }
}

public class Main {
    public static void main(String[] args){
        DoublyLinkedList numList = new DoublyLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(numList.head.data);
        System.out.println(numList.head.next.data);
        System.out.println(numList.head.next.prev.data);
        System.out.println(numList.tail.data);
        System.out.println(numList.tail.prev.data);
        System.out.println(numList.tail.prev.prev.data);
    }
}
