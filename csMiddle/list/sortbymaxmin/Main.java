package csMiddle.list.sortbymaxmin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByMaxMin(new int[]{5,3,2,3,4})));
    }
    public static int[] sortByMaxMin(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if(start == end) {
                arrayList.add(arr[end]);
                start++;
                end--;
            } else {
                arrayList.add(arr[end]);
                arrayList.add(arr[start]);
                start++;
                end--;
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

//    より良い解
//    public static int[] sortByMaxMin(int[] arr) {
//        Arrays.sort(arr);
//        int[] result = new int[arr.length];
//        int start = 0;
//        int end = arr.length - 1;
//        int index = 0;
//
//        while (start <= end) {
//            if (index < arr.length) {
//                result[index++] = arr[end--];
//            }
//            if (index < arr.length) {
//                result[index++] = arr[start++];
//            }
//        }
//
//        return result;
//    }
}
