package csMiddle.recursion.fibonaccitotal;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciTotal(9));
    }
    public static int fibonacciTotal(int n){
        return fibonacciTotalHelper(1, 1, n);
    }

    public static int fibonacciTotalHelper(int fn1, int fn2, int n) {
        if(n < 1) {
            return fn1+fn2;
        }

        return fibonacciTotalHelper(fn2, fn1+fn2, n-1);
    }
}
