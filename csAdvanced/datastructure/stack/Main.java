package csAdvanced.datastructure.stack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Stack s1 = new Stack();

        s1.push(2);
        System.out.println(s1.peek());
        s1.push(4);
        s1.push(3);
        s1.push(1);
        System.out.println(s1.pop());
        System.out.println(s1.peek());

        Stack s2 = new Stack();
        System.out.println(s2.pop());
        s2.push(9);
        s2.push(8);
        System.out.println(s2.peek());
    }

    public static int[] reverse(int[] arr){
        Stack stack = new Stack();
        for(int item: arr) {
            stack.push(item);
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(stack.head != null) {
            result.add(stack.pop());
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

class Item {
    public int data;
    public Item next;

    public Item(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    public Item head;

    public Stack() {
      head = null;
    }

    public void push(int data) {
        Item newData = new Item(data);
        Item tmp = head;
        head = newData;
        head.next = tmp;
    }

    public Integer pop() {
        if(head == null) return null;
        Integer headNum = head.data;
        head = head.next != null ? head.next : null;
        return headNum;
    }

    public Integer peek() {
        return head.data;
    }
}