package csMiddle.list.sumofoddelement;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfOddElement(new int[]{1, 2}));
    }

    public static int sumOfOddElement(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            if(isOdd(arr[i])) sum += arr[i];
        }
        return sum;
    }

    private static boolean isOdd(int num) {
        if(num % 2 != 0) return true;
        else return false;
    }
}
