package csMiddle.list.missingItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingItems(new int[]{1, 2}, new int[]{2, 3})));
    }
    public static int[] missingItems(int[] listA, int[] listB){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int item: listB) {
            hashSet.add(item);
        }
        ArrayList<Integer> excluedList = new ArrayList<>();
        for(int item: listA) {
            if (!hashSet.contains(item)) {
                excluedList.add(item);
            }
        }
        return excluedList.stream().mapToInt(i -> i).toArray();
    }
}
