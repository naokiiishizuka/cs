package csMiddle.recursion.stringcompression;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbbCCLL"));
    }

    public static String stringCompression(String s){
        if (s.length() == 1) return s;
        return stringCompressionHelper(s.substring(1), s.charAt(0), 1);
    }

    public static String stringCompressionHelper(String s, char front, int count) {
        if (s.isEmpty()) {
            return front + (count > 1 ? String.valueOf(count) : "");
        }

        if (s.charAt(0) == front) {
            return stringCompressionHelper(s.substring(1), front, count + 1);
        } else {
            String countString = count > 1 ? String.valueOf(count) : "";
            return front + countString + stringCompressionHelper(s.substring(1), s.charAt(0), 1);
        }
    }
}
