package csMiddle.list.intersectionOfArraysRepeats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersectionOfArraysRepeats(new int[]{2, 1}, new int[]{2, 1})));
    }
    public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int item: intList1) {
            hashMap.put(item, hashMap.getOrDefault(item, 0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int item: intList2) {
            int count = hashMap.getOrDefault(item, 0);
            if(count > 0) {
                result.add(item);
                hashMap.put(item, --count);
            }
        }
        return result.stream().sorted().mapToInt(i->i).toArray();
    }
}
