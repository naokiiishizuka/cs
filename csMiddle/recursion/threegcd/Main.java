package csMiddle.recursion.threegcd;

public class Main {
    public static void main(String[] args) {
        System.out.println(threeGCD(12, 18, 24));
    }

    public static int threeGCD(int x, int y, int z){
        int a = gcd(x, y);
        return gcd(z, a);
    }

    public static int gcd(int a, int b) {
        if(a%b == 0) return b;
        return gcd(b, a%b);
    }
}
