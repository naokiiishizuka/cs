package csMiddle.controlflow.isprime;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(729));
    }

    public static boolean isPrime(int number){
        if(number == 1) return false;
        for(int i=2; i<number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
