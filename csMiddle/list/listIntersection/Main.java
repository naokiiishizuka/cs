package csMiddle.list.listIntersection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(listIntersection(new int[]{1, 2}, new int[]{1, 2})));
    }
    public static int[] listIntersection(int[] targetList, int[] searchList){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<targetList.length; i++) {
            hashMap.put(targetList[i], i);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int j : searchList) {
            if (hashMap.containsKey(j)) result.add(j);
        }
        int[] sortedArray = result.stream().mapToInt(i -> i).toArray();
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
