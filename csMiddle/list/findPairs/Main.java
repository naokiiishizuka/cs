package csMiddle.list.findPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPairs(new int[]{635,312,582,541,253,180,656,191,312,862,135,650,691,525,249,291,190,418,999,226,527,781,228,80,979,310,524,752,43,68,505,559,266,964,188,774,276,999,38,862,827,86,400,799,914,258,455,892,126,636})));
    }

    public static int[] findPairs(int[] numbers){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int number: numbers) {
            hashMap.put(number, hashMap.getOrDefault(number, 0) +1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        hashMap.forEach((key, value) -> {
            if(value == 2) result.add(key);
        });
        return  result.stream().sorted().mapToInt(i->i).toArray();
    }
}
