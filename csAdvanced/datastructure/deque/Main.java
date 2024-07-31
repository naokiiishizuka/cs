package csAdvanced.datastructure.deque;

public class Main {
    public static void main(String[] args){
        Deque q = new Deque();
        q.enqueueBack(4);
        q.enqueueBack(50);
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        q.enqueueFront(36);
        q.enqueueFront(96);
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        System.out.println(q.dequeueBack());
        System.out.println(q.dequeueBack());
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        q.enqueueFront(20);
        System.out.println(q.dequeueBack());
    }

    public static int getMax(int[] arr){
        Deque q = new Deque();
        q.enqueueFront(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(q.peekFront() < arr[i]) q.enqueueFront(arr[i]);
            else q.enqueueBack(arr[i]);
        }
        return q.peekFront();
    }
}

class Item {
    public int data;
    public Item prev;
    public Item next;

    public Item(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Deque {
     public Item head;
     public Item tail;
     public Integer peekFront() {
         if(head == null) return null;
         return head.data;
     }

     public Integer peekBack() {
         if(tail == null) return null;
         return tail.data;
     }

    public void enqueueFront(int data) {
         Item item = new Item(data);
         if(head == null) {
            head = item;
            tail = this.head;
         } else {
             this.head.prev = item;
             this.head.prev.next = this.head;
             this.head = this.head.prev;
         }
    }

    public void enqueueBack(int data) {
        Item item = new Item(data);
        if(head == null) {
            head = item;
            tail = head;
        } else {
            this.tail.next = item;
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
        }
    }

    public Integer dequeueFront() {
         if(head == null) return null;
         Item tmp = head;
         if(head.next == null) {
             head = null;
             tail = null;
         } else {
             head = head.next;
         }
         return tmp.data;
    }

    public Integer dequeueBack() {
         if(tail == null) return null;
         Item tmp = tail;
         if(tail.prev == null) {
             tail = null;
             head = null;
         } else {
             tail = tail.prev;
         }
         return tmp.data;
    }
}