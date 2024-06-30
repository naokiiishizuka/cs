package csMiddle.recursion.commonprefix;

public class Main {
    public static void main(String[] args) {
        System.out.println(commonPrefix("abcdefg","abcxyz"));
    }

    public static String commonPrefix(String s1, String s2){
        if(s1.isEmpty() || s2.isEmpty()) return "";
        if(!s1.substring(0, 1).equals(s2.substring(0, 1))) return "";
        return s1.substring(0, 1) + commonPrefix(s1.substring(1), s2.substring(1)); 
    }
}
