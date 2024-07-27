package csMiddle.list.doubledArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubledArray(new int[]{1, 2, 3, 4, 5, 6})));
    }
    public static int[] doubledArray(int[] arr){
        return doubleArrayHelper(arr, 0, arr.length-1);
    }

    private static int[] doubleArrayHelper(int[] arr, int start, int end) {
        if(start == end) return new int[]{arr[start] * 2};

        int middle = (start + end) / 2;

        int[] leftArr = doubleArrayHelper(arr, start, middle);
        int[] rightArr = doubleArrayHelper(arr, middle+1, end);

        int[] result = new int[leftArr.length + rightArr.length];
        System.arraycopy(leftArr, 0, result, 0, leftArr.length);
        System.arraycopy(rightArr, 0, result, leftArr.length, rightArr.length);

        return result;
    }
}
