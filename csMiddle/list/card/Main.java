package csMiddle.list.card;

import java.util.ArrayList;
import java.util.List;

class Card {
    public String suit;
    public String value;
    public String intValue;

    public Card(String suit, String value, String intValue) {
        this.suit = suit;
        this.value = value;
        this.intValue = intValue;
    }
}

class MyClass{
    public static void main(String[] args){
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card("♣", "A", "1"));
        cards.add(new Card("♦", "K", "13"));
        cards.add(new Card("♥", "Q", "12"));
        cards.add(new Card("♠", "J", "11"));
        printCardArray(cards);
    }
    public static void printCardArray(List<Card> cards) {
        for(int i=0; i<cards.size(); i++) {
            System.out.println(cards.get(i).suit + cards.get(i).value + "(" + cards.get(i).intValue + ")");
        }
    }
}
