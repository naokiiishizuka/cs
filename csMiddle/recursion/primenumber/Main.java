package csMiddle.recursion.primenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveIsPrime(5));
    }
    public static boolean recursiveIsPrime(int n){
        if(n == 1) return false;
        return recursiveIsPrimeHelper(n, n-1);
    }

    public static boolean recursiveIsPrimeHelper(int n, int k){
        if(k == 1) return true;
        if(n % k == 0) return false;
        return recursiveIsPrimeHelper(n, k-1);
    }
}
