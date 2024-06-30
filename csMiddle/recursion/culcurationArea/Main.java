package csMiddle.recursion.culcurationArea;

public class Main {
    public static void main(String[] args) {
        System.out.println(totalSquareArea(3));
    }

    public static int totalSquareArea(int x){
        if(x == 1) return 1;
        return x*x*x + totalSquareArea(x-1);
    }
}
