package csMiddle.list.selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{3, 2, 1})));
    }
    public static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++) {
            var minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
