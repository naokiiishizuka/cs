package csMiddle.recursion.recursiveIspalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveIsPalindrome("Top spot"));
    }

    public static boolean recursiveIsPalindrome(String s){
        String newS = s.replace(" ", "").toLowerCase();
        return recursiveIsPalindromeHelper(newS, 0, newS.length()-1);
    }

    public static boolean recursiveIsPalindromeHelper(String s, int begin, int last) {
        if(begin >= last) return true;
        if(s.charAt(begin) == s.charAt(last)) return recursiveIsPalindromeHelper(s, begin+1, last-1);
        else return false;
    }
}
