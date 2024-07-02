package csMiddle.recursion.numberofway;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfWay(5));
    }

    public static int numberOfWay(int x){
        if(x == 1) return 1;
        if(x == 2) return 2;
        return numberOfWay(x-1) + numberOfWay(x-2);
    }
}
