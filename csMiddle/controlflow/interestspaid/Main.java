package csMiddle.controlflow.interestspaid;

public class Main {
    public static void main(String[] args) {
        System.out.println(interestsPaid(830,false));
    }

    public static double interestsPaid(int initialLoan, boolean didPayOnTime){
        if(didPayOnTime) return (initialLoan * 102) / 100.0 + 2.5;
        else return (initialLoan * 115) / 100.0 + 2.5;
    }
}
