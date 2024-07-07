package csMiddle.controlflow.decimaltohexadecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(decimalToHexadecimal(74));
    }
    public static String decimalToHexadecimal(int decNumber){
        StringBuilder builder = new StringBuilder();
        for(int i=decNumber; i>=1; i/=16) {
            char hexChar = Character.forDigit(i % 16, 16);
            builder.append(hexChar);
        }
        return builder.reverse().toString();
    }
}
