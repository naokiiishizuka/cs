package csAdvanced.datastructure.queue;

public class Main {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(4);
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        q.enqueue(50);
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        q.enqueue(64);
        System.out.println(q.peekFront());
        System.out.println(q.peekBack());
        System.out.println(q.dequeue());
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    public Node head;
    public Node tail;

    public Integer peekFront() {
        return head.data;
    }

    public Integer peekBack() {
        return tail.data;
    }

    public void enqueue(int data) {
        if(this.head == null){
            this.head = new Node(data);
            this.tail = this.head;
        }
        else{
            this.tail.next = new Node(data);
            this.tail = this.tail.next;
        }
    }

    public Integer dequeue() {
        if(this.head == null) return null;

        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null) this.tail = null;

        return temp.data;
    }
}