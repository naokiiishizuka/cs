package csMiddle.list.charFrequency;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(charFrequency("sssss")));
    }
    public static String[] charFrequency(String message){
        String replaceMessage =  message.replace(" ", "");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<replaceMessage.length(); i++) {
            hashMap.put(replaceMessage.charAt(i), hashMap.getOrDefault(replaceMessage.charAt(i), 0) + 1);
        }
        Character[] mapsKey = hashMap.keySet().toArray(new Character[0]);
        Arrays.sort(mapsKey);
        String[] resultArray = new String[mapsKey.length];
        for(int i=0; i<hashMap.size(); i++) {
            resultArray[i] = mapsKey[i] + " : " + hashMap.get(mapsKey[i]);
        }
        return resultArray;
    }
}
