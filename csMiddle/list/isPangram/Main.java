package csMiddle.list.isPangram;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPangram("the five boxing wizards jump quickly"));
    }
    public static boolean isPangram(String string){
        HashSet<Character> alphabet = new HashSet<>();
        for(char ch: string.replace(" ", "").toLowerCase().toCharArray()) {
            alphabet.add(ch);
        }
        return alphabet.size() == 26;
    }
}
