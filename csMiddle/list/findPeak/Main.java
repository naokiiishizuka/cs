package csMiddle.list.findPeak;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPeak(new int[]{995,36,88,500,431,769,492,39,238,27,988,436,815,223,294,75}));
    }
    public static int findPeak(int[] arr){
        return findPeakHelper(arr, 0, arr.length);
    }

    private static int findPeakHelper(int[] arr, int low, int high) {
        if(low == high) return arr[low];

        int mid = (low + high) / 2;

        if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return findPeakHelper(arr, mid + 1, high);
        } else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
            return findPeakHelper(arr, low, mid - 1);
        } else {
            return arr[mid];
        }
    }
}
