package csAdvanced.datastructure.singlyLinkedListNode;

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
        SinglyLinkedListNode<Integer> newNodeList =  insertAtPosition(nodeList, 0, 3);
        nodeList.printLinkedList(newNodeList);
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

    public static SinglyLinkedListNode<Integer> deleteTail(SinglyLinkedListNode<Integer> head){
        SinglyLinkedListNode<Integer> current = head;
        if(current.next == null) {
            return null;
        }
        while(current != null) {
            if(current.next.next == null) {
                current.next = null;
                break;
            }
            current = current.next;
        }
        return head;
    }

    public static int findMinNum(SinglyLinkedListNode<Integer> head){
        SinglyLinkedListNode<Integer> current = head;
        int index = 0;
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        while(current != null) {
            if(minValue >= current.data) {
                minValue = current.data;
                minIndex = index;
            }
            index++;
            current = current.next;
        }
        return minIndex;
    }

    public static int linkedListSearch(SinglyLinkedListNode<Integer> head, int data){
        SinglyLinkedListNode<Integer> current = head;
        int index = 0;
        while(current != null) {
            if(current.data == data) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public static SinglyLinkedListNode<Integer> insertAtPosition(SinglyLinkedListNode<Integer> head, int position, int data){
        SinglyLinkedListNode<Integer> current = head;
        int index = 0;
        while(current != null) {
            if(index == position) {
                SinglyLinkedListNode<Integer> tmp = current.next;
                SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<Integer>(data);
                current.next = newNode;
                newNode.next = tmp;
            }
            current = current.next;
            index++;
        }
        return head;
    }
}

