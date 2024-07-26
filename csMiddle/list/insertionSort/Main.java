package csMiddle.list.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{5,4,3,2,1})));
    }
    public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            int currentValue = arr[i];
            for(int j=i-1; j>=0; j--) {
                if(currentValue <= arr[j]) {
                    arr[j+1] = arr[j];
                    arr[j] = currentValue;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
