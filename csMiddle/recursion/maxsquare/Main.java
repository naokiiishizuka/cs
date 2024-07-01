package csMiddle.recursion.maxsquare;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSquare(517,658));
    }
    public static int countSquare(int x, int y){
        int max = countSquareHelper(x, y);
        return (x*y)/(max*max);
    }

    public static int countSquareHelper(int x, int y){
        if(x%y == 0) return y;
        return countSquareHelper(y, x%y);
    }
}
