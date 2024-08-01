package csAdvanced.datastructure.isParenthesesValid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(isParenthesesValid("(((("));
    }

    static Character[] startChars = {'{', '[', '('};
    static Character[] endChars = {'}', ']', ')'};
    static List<Character> startList = Arrays.asList(startChars);
    static List<Character> endList = Arrays.asList(endChars);

    public static boolean isParenthesesValid(String parentheses){
        Stack stack = new Stack();
        for(int i=0; i<parentheses.length(); i++) {
            if(startList.contains(parentheses.charAt(i))) {
                stack.push(parentheses.charAt(i));
            } else {
                if(stack.head == null) return false;
                char c = parentheses.charAt(i);
                int endNum = endList.indexOf(c);
                int startNum = startList.indexOf(stack.pop());
                if(startNum != endNum) {
                    return false;
                }
            }
        }
        if(stack.head != null) return false;
        return true;
    }
}

class Item {
    public Character data;
    public Item next;

    public Item(char data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    public Item head;

    public Stack() {
        head = null;
    }

    public void push(Character data) {
        Item newData = new Item(data);
        Item tmp = head;
        head = newData;
        head.next = tmp;
    }

    public Character pop() {
        if(head == null) return null;
        Character headNum = head.data;
        head = head.next != null ? head.next : null;
        return headNum;
    }

    public Character peek() {
        return head.data;
    }
}