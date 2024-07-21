package csMiddle.list.appearTheMost;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(appearTheMost(new int[]{1, 5, 3, 4, 3, 1, 6})));
    }
    public static int[] appearTheMost(int[] levels){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int level: levels) {
            hashMap.put(level, hashMap.getOrDefault(level, 0)+1);
        }
        HashSet<Integer> mostSet = new HashSet<>();
        int mostNum = 0;
        for(int level: levels) {
            if(mostNum == hashMap.get(level)) {
                mostSet.add(level);
            }
            if(mostNum < hashMap.get(level)) {
                mostSet.clear();
                mostSet.add(level);
                mostNum = hashMap.get(level);
            }
        }

        int[] result = mostSet.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);

        return result;
    }
}
