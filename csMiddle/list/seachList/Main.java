package csMiddle.list.seachList;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(seachList(new int[]{1, 2}, 2));
    }
    public static int seachList(int[] numList, int value){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<numList.length; i++) {
            hashMap.put(numList[i], i);
        }
        return hashMap.getOrDefault(value, -1);
    }
}
