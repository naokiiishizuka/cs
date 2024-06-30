package csMiddle.recursion.swappingevenandodd;

public class Main {
    public static void main(String[] args) {
        System.out.println(swapPosition("abcde"));
    }

    public static String swapPosition(String s){
        if(s.length() <= 1) return s;
        return s.substring(1, 2) + s.substring(0, 1) + swapPosition(s.substring(2));
    }
}
