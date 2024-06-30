package csMiddle.recursion.virtualcurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println(maximumPeople(12, 18));
    }

    public static int maximumPeople(int x, int y){
        if(x % y == 0) return y;
        return maximumPeople(y, x%y);
    }
}
