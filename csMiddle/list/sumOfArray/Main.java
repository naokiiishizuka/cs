package csMiddle.list.sumOfArray;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1, 2, 3, 4, 5, 6}));
    }
    public static int sumOfArray(int[] arr){
        return sumOfArrayHelper(arr, 0, arr.length - 1);
    }

    private static int sumOfArrayHelper(int[] arr, int start, int end) {
        if(start == end) return arr[start];

        int middle = (int)Math.floor((start+end)/2);

        int leftArr = sumOfArrayHelper(arr, start, middle);
        int rightArr = sumOfArrayHelper(arr, middle+1, end);

        return leftArr + rightArr;
    }
}
