package csMiddle.list.twoSum;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 5}, 5)));
    }
    public static int[] twoSum(int[] intArr, int sumInt){
        int[] resultArr = new int[2];
        for(int i=0; i<intArr.length; i++) {
            for(int j=i+1; j<intArr.length; j++) {
                if(intArr[i] + intArr[j] == sumInt){
                    resultArr[0] = i;
                    resultArr[1] = j;
                    return resultArr;
                }
            }
        }
        return new int[0];
    }

//    より効率的な実装
//    public static int[] twoSum(int[] intArr, int sumInt) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < intArr.length; i++) {
//            int complement = sumInt - intArr[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(intArr[i], i);
//        }
//        return new int[0];
//    }
}
