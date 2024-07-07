package csMiddle.controlflow.caesarcipher;

public class Main {
    public static void main(String[] args) {
        System.out.println(caesarCipher("z",1));
    }

    public static String caesarCipher(String message, int n){
        String tripMessage = message.replace(" ", "");
        int newN = n % 26;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<tripMessage.length(); i++) {
            char currentChar = tripMessage.charAt(i);
            char nextChar = (char)(tripMessage.charAt(i)+newN);
            if (currentChar >= 'a' && currentChar <= 'z') {
                if (nextChar > 'z') {
                    nextChar = (char) (nextChar - 26);
                }
            }
            stringBuilder.append(nextChar);
        }
        return stringBuilder.toString();
    }
}
