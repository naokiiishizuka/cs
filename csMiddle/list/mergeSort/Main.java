package csMiddle.list.mergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1, 3, 2, 6, 5, 4})));
    }
    public static int[] mergeSort(int[] arr){
        return mergeSortHelper(arr, 0, arr.length-1).stream().mapToInt(i -> i).toArray();
    }

    private static ArrayList<Integer> mergeSortHelper(int[] arr, int start, int end) {
        if(start == end) return new ArrayList<Integer>(List.of(arr[start]));

        // 配列が 2 つ以上の時には leftArray と rightArray に分割し続けます
        int middle = (start+end)/2;

        List<Integer> leftArr = mergeSortHelper(arr, start, middle);
        List<Integer> rightArr = mergeSortHelper(arr, middle+1, end);

        leftArr.add(Integer.MAX_VALUE);
        rightArr.add(Integer.MAX_VALUE);

        int l = leftArr.size() + rightArr.size() - 2;
        int li = 0;
        int ri = 0;

        ArrayList<Integer> merged = new ArrayList<>();

        while(li+ri < l){
            if(leftArr.get(li) <= rightArr.get(ri)){
                merged.add(leftArr.get(li));
                li++;
            }else {
                merged.add(rightArr.get(ri));
                ri++;
            }
        }
        return merged;
    }
}
