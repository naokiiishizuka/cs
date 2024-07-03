package csMiddle.recursion.divideby3count;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideBy3Count(729));
    }
    public static int divideBy3Count(int n){
        if(n%3 != 0) return 0;
        return 1 + divideBy3Count(n/3);
    }
}
