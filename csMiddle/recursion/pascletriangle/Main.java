package csMiddle.recursion.pascletriangle;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfDots(4));
    }

    public static int numberOfDots(int x){
        if(x == 0) return 0;
        return numberOfDots(x-1) + x;
    }
}
