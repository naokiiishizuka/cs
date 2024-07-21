package csMiddle.list.shuffleSuccessRate;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(shuffleSuccessRate(new int[]{2,32,45}, new int[]{45,32,2}));
    }
    public static int shuffleSuccessRate(int[] arr, int[] shuffledArr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<shuffledArr.length; i++) {
            hashMap.put(i, shuffledArr[i]);
        }
        int correctPosition = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != hashMap.get(i)) correctPosition++;
        }
        return correctPosition * 100 / arr.length;
    }
}
