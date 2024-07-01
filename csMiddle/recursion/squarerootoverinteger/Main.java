package csMiddle.recursion.squarerootoverinteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(intSquareRoot(9));
    }
    public static int intSquareRoot(int n){
        return intSquareRootHelper(n, 1);
    }

    public static int intSquareRootHelper(int n, int k) {
        if(k*k <= n && n < (k+1)*(k+1)) return k;
        return intSquareRootHelper(n, k+1);
    }
}
