package csMiddle.recursion.splitandadd;

public class Main {
    public static void main(String[] args) {
        System.out.println(splitAndAdd(157));
    }
    public static int splitAndAdd(int digits){
        if(digits == 0) return 0;
        return (digits % 10) + splitAndAdd(digits/10);
    }
}
