package csMiddle.recursion.multiplication;

public class Main {
    public static void main(String[] args) {
        System.out.println(product(-2, 3));
    }

    public static int product(int x, int y){
        if (y == 0) return 0;
        if (y < 0) {
            return product(x, y+1) - x;
        } else  {
            return product(x, y-1) + x;
        }
    }
}
