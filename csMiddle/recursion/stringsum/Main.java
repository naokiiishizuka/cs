package csMiddle.recursion.stringsum;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeString("hello", "world"));
    }

    public static String mergeString(String s1, String s2){
        if(s1.isEmpty()) return "";
        return s1.substring(0, 1) + s2.substring(0, 1) + mergeString(s1.substring(1), s2.substring(1));
    }
}
