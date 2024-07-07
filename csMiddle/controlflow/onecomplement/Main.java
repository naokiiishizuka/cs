package csMiddle.controlflow.onecomplement;

public class Main {
    public static void main(String[] args) {
        System.out.println(oneComplement("1001"));
    }

    public static String oneComplement(String bits){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<bits.length(); i++) {
            if(bits.charAt(i) == '0') builder.append('1');
            else builder.append('0');
        }
        return builder.toString();
    }
}
