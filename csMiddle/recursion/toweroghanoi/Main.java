package csMiddle.recursion.toweroghanoi;

public class Main {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(10));
    }

    public static int towerOfHanoi(int discs){
        if(discs==1) return 1;
        return 2 * towerOfHanoi(discs-1) + 1;
    }
}
