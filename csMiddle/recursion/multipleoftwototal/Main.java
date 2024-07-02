package csMiddle.recursion.multipleoftwototal;

public class Main {
    public static void main(String[] args) {
        System.out.println(multipleOfTwoTotal(3));
    }
    public static int multipleOfTwoTotal(int n){
        if(n == 0) return 0;
        return total(n) + multipleOfTwoTotal(n-1);
    }

    public static int total(int n) {
        if(n == 0) return 0;
        return 2*n + total(n-1);
    }
}
