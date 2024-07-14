package csMiddle.list.getmaxindex;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMaxIndex(new int[]{1, 2}));
    }

    public static int getMaxIndex(int[] arr){
        int maxIndex = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[maxIndex] <= arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
