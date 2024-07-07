package csMiddle.controlflow.notdivisiblenumbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(notDivisibleNumbers(20,3));
    }
    public static String notDivisibleNumbers(int x, int y){
        StringBuilder builder = new StringBuilder();
        builder.append(1);
        for(int i=2; i<=x; i++) {
            if(i%y != 0) {
                builder.append('-');
                builder.append(i);
            }
        }
        return builder.toString();
    }
}
