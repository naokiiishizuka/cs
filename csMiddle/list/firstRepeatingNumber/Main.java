package csMiddle.list.firstRepeatingNumber;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstRepeatingNumber(new int[]{1,5,3,4,3,1,6}));
    }
    public static int firstRepeatingNumber(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (hashMap.get(num) > 1) {
                return num;
            }
        }
        return -1;
    }
}
