package csMiddle.controlflow.ispalindromeointeger;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromeInteger(12221));
    }
    public static boolean isPalindromeInteger(int n){
        String s = String.valueOf(n);
        int begin = 0;
        int end = s.length()-1;
        while(begin < end) {
            if(s.charAt(begin) != s.charAt(end)) return false;
            begin+=1;
            end-=1;
        }
        return true;
    }
}
