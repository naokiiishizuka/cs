package csAdvanced.datastructure.SinglyLinkedListNodeGetIndexValue;

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

    public static int getIndexValue(SinglyLinkedListNode<Integer> head, int index){
        int i = 0;
        SinglyLinkedListNode<Integer> current = head;
        while (current != null) {
            if(i == index-1) return current.data;
            current = current.next;
            i++;
        }
        return -1;
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
}

