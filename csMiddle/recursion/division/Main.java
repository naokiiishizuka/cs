package csMiddle.recursion.division;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDivisibleByK(243, 3));
    }

    public static int countDivisibleByK(int n, int k){
        if(n%k != 0) return 0;
        return 1+countDivisibleByK(n/k, k);
    }
}
