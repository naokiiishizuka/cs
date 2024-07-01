package csMiddle.recursion.maxbread;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxBread(243, 3, 12));
    }

    public static int maxBread(int money, int price, int sticker){
        return maxBreadHelper(money, price, sticker, 0);
    }

    private static int maxBreadHelper(int money, int price, int sticker, int currentStickers) {
        if (money < price && currentStickers < sticker) {
            return 0;
        }

        int breadFromMoney = money / price;
        int remainingMoney = money % price;
        int totalStickers = currentStickers + breadFromMoney;
        int breadFromStickers = totalStickers / sticker;
        int remainingStickers = totalStickers % sticker + breadFromStickers;;

        return breadFromMoney + breadFromStickers + 
               maxBreadHelper(remainingMoney, price, sticker, remainingStickers);
    }
}
