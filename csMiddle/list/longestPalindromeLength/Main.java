package csMiddle.list.longestPalindromeLength;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindromeLength("forkayakkayakfor"));
    }
    public static int longestPalindromeLength(String string){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<string.length(); i++) {
            hashMap.put(string.charAt(i), hashMap.getOrDefault(string.charAt(i), 0) + 1);
        }
        int result = 0;
        boolean isSingle = false;
        for(Character key: hashMap.keySet()) {
            if(hashMap.get(key) % 2 == 1) {
                isSingle = true;
                result += hashMap.get(key) -1;
            }
            else result += hashMap.get(key);
        }
        if(isSingle) result += 1;
        return  result;
    }
}
