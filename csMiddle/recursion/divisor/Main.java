package csMiddle.recursion.divisor;

public class Main {

    public static void main(String[] args) {
        System.out.println(divisor(720));
    }
    public static String divisor(int number){
        return divisorHelper(number, 1);
    }

    public static String divisorHelper(int number, int count) {
        if(count == number) return String.valueOf(count);
        if(number % count == 0) return  count + "-" + divisorHelper(number, ++count);
        return divisorHelper(number, ++count);
    }
}
