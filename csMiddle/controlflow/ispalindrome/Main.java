package csMiddle.controlflow.ispalindrome;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("acaca"));
    }

    public static boolean isPalindrome(String stringInput){
        String newStringInput = stringInput.toLowerCase().replace(" ", "");
        int start = 0;
        int end = newStringInput.length()-1;
        while(start < end) {
            if(newStringInput.charAt(start) != newStringInput.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
