package csMiddle.controlflow.decimaltobinary;

public class Main {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(60));
    }
    public static String decimalToBinary(int decNumber){
        StringBuilder builder = new StringBuilder();
        for(int i=decNumber; i>=1; i/=2) {
            builder.append(i%2);
        }
        return builder.reverse().toString();
    }
}
