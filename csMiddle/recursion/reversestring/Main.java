package csMiddle.recursion.reversestring;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
    }

    public static String reverseString(String s){
        if(s.isEmpty()) return "";
        return s.substring(s.length()-1, s.length()) + reverseString(s.substring(0, s.length() - 1));
    }
}
