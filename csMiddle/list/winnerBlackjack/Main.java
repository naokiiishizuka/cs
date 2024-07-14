package csMiddle.list.winnerBlackjack;

public class Main {
    public static void main(String[] args) {
        System.out.println(winnerBlackjack(new String[]{"♣4","♥7","♥7"},new String[]{"♠Q","♣J"}));
    }

    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards){
        return blackjackTotal(playerCards) <= 21 && (blackjackTotal(playerCards) > blackjackTotal(houseCards) || blackjackTotal(houseCards) > 21);
    }

    private static int blackjackTotal(String[] cards) {
        int sum = 0;
        for(String card : cards) {
            if(card.substring(1).equals("A")) sum += 1;
            else if(card.substring(1).equals("J")) sum += 11;
            else if(card.substring(1).equals("Q")) sum += 12;
            else if(card.substring(1).equals("K")) sum += 13;
            else sum += Integer.parseInt(card.substring(1));
        }
        return sum;
    }
}
