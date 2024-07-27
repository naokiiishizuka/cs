package csAdvanced.datastructure.singlyLinkedList;

class Item {
    public int data;
    public Item next;

    public Item(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {
    Item head;

    public SinglyLinkedList(Item head) {
        this.head = head;
    }
}

public class Main {
    public static void main(String[] args){
        Item item1 = new Item(7);
        Item item2 = new Item(99);
        Item item3 = new Item(45);

        item1.next = item2;
        item2.next = item3;

        SinglyLinkedList numList = new SinglyLinkedList(item1);

        while (numList.head != null) {
            System.out.println(numList.head.data);
            numList.head = numList.head.next;
        }
    }
}
