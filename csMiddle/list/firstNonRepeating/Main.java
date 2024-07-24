package csMiddle.list.firstNonRepeating;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstNonRepeating("aabbcdddeffg"));
    }
    public static int firstNonRepeating(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
