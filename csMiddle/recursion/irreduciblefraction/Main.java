package csMiddle.recursion.irreduciblefraction;

public class Main {
    public static void main(String[] args) {
        System.out.println(irreducibleFraction(243, 3));
    }

    public static String irreducibleFraction(int x, int y){
        int a = gcd(x, y);
        if(y/a == 1) return String.valueOf(x / a);
        return (x/a) + "/" + (y/a);
    }

    public static int gcd(int x, int y) {
        if(x%y == 0) return y;
        return gcd(y, x%y);
    }
}
