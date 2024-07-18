package csMiddle.list.maxOfPairSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxOfPairSum(new int[]{2,8,7}, new int[]{1,5,6}, 10));
    }
    public static String maxOfPairSum(int[] arr1, int[] arr2, int x){
        int maxSum = Integer.MIN_VALUE;
        for (int i : arr1) {
            for (int j : arr2) {
                if (maxSum < i + j && i + j < x) maxSum = i + j;
            }
        }
        return maxSum != Integer.MIN_VALUE ? String.valueOf(maxSum) : "no pair";
    }
}
