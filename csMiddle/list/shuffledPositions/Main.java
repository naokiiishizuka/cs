package csMiddle.list.shuffledPositions;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffledPositions(new int[]{1, 2}, new int[]{2, 1})));
    }
    public static int[] shuffledPositions(int[] arr, int[] shuffledArr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<shuffledArr.length; i++) {
            hashMap.put(shuffledArr[i], i);
        }
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            result[i] = hashMap.get(arr[i]);
        }
        return result;
    }
}
