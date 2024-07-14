package csMiddle.list.isFirstStringLarger;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println(isFirstStringLarger("hello","HelLo"));
    }
    public static boolean isFirstStringLarger(String s1, String s2) {
        return getAsciiCodes(s1.toLowerCase()) > getAsciiCodes(s2.toLowerCase());
    }

    private static int getAsciiCodes(String s) {
        int sum = 0;
        byte[] asciiCodes = s.getBytes(StandardCharsets.US_ASCII);
        for (byte asciiCode : asciiCodes) {
            sum += asciiCode;
        }
        return sum;
    }

//    そのままcharとして計算しても良い
//    private static int getAsciiCodes(String s) {
//        int sum = 0;
//        for (char c : s.toCharArray()) {
//            sum += (int) c;
//        }
//        return sum;
//    }
}
