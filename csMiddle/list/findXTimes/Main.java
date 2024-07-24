package csMiddle.list.findXTimes;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(findXTimes("bacddc"));
    }

    public static boolean findXTimes(String teams){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<teams.length(); i++) {
            hashMap.put(teams.charAt(i), hashMap.getOrDefault(teams.charAt(i), 0)+1);
        }
        int firstCount = hashMap.get(teams.charAt(0));
        for(Integer value: hashMap.values()) {
            if(firstCount != value) return false;
        }
        return true;
    }
}
