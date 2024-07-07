package csMiddle.controlflow.countbetweennumbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(countBetweenNumbers(1,1,20));
    }
    public static int countBetweenNumbers(int digit, int idStart, int idEnd){
        int count = 0;
        String digitStr = String.valueOf(digit);
        for(int i=idStart; i<=idEnd; i++) {
            String stringI = String.valueOf(i);
            for(int j=0; j<stringI.length(); j++) {
                if(digitStr.charAt(0) == stringI.charAt(j)) count++;
            }
        }
        return count;
    }
}
