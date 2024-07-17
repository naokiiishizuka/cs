package csMiddle.list.rotateByTimes;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateByTimes(new int[]{1,2,3,4,5}, 2)));
    }
    public static int[] rotateByTimes(int[] ids, int n){
        int len = ids.length;
        int[] rotatedIds = new int[len];

        for (int i = 0; i < len; i++) {
            rotatedIds[(i + n) % len] = ids[i];
        }

        return rotatedIds;
    }
}
