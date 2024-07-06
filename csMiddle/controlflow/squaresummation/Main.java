package csMiddle.controlflow.squaresummation;

public class Main {
    public static void main(String[] args) {
        System.out.println(squareSummation(3));
    }

    public static int squareSummation(int n){
        int count = 0;
        for(int i=1; i<=n; i++) count += i*i;
        return count;
    }
}
