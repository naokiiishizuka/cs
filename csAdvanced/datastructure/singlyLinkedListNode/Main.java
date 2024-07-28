package csAdvanced.datastructure.singlyLinkedListNode;

import java.util.Arrays;

class SinglyLinkedListNode<E>{
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data){
        this.data = data;
        this.next = null;
    }

    public void printLinkedList(SinglyLinkedListNode<E> head) {
        SinglyLinkedListNode<E> current = head;

        while (current != null) {
            System.out.print(current.data + "➡");
            current = current.next;
        }

        System.out.println("END");
    }
}

public class Main{
    public static void main(String[] args){
        SinglyLinkedListNode<Integer> nodeList = getLinkedList(new int[]{1, 2, 3});
        nodeList.printLinkedList(nodeList);
    }
    public static SinglyLinkedListNode<Integer> getLinkedList(int[] arr){
        SinglyLinkedListNode<Integer> head = new SinglyLinkedListNode<>(arr[0]);
        SinglyLinkedListNode<Integer> current = head;
        for(int i=1; i<arr.length; i++) {
            current.next = new SinglyLinkedListNode<>(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static int linkedListLength(SinglyLinkedListNode<Integer> head){
        int result = 0;
        SinglyLinkedListNode<Integer> current = head;
        while(current != null) {
            result++;
            current = current.next;
        }
        return result;
    }

    public static int linkedListLastValue(SinglyLinkedListNode<Integer> head){
        SinglyLinkedListNode<Integer> current = head;
        while(current != null) {
            if(current.next == null) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }
//
//    public static SinglyLinkedListNode<Integer> deleteTail(SinglyLinkedListNode<Integer> head){
//        SinglyLinkedListNode<Integer> current = head;
//        if(current.next == null) {
//            return null;
//        }
//        while(current != null) {
//            if(current.next.next == null) {
//                current.next = null;
//                break;
//            }
//            current = current.next;
//        }
//        return head;
//    }
}

