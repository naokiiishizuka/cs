package csMiddle.minandmax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minAndMax(new int[]{5,3,2,3,4})));
    }

    public static int[] minAndMax(int[] intArr){
        int sum = 0;
        int max = intArr[0];
        int min = intArr[0];
        for (int j : intArr) {
            sum += j;
            if (max < j) max = j;
            if (min > j) min = j;
        }
        return new int[]{sum-max, sum-min};
    }
}
