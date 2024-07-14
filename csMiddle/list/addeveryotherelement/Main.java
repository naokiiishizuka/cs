package csMiddle.list.addeveryotherelement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(addEveryOtherElement(new int[]{5,3,2,3,4}));
    }
    public static int addEveryOtherElement(int[] intArr){
        int sum = 0;
        for(int i=0; i<intArr.length; i++) {
            if(i%2 == 0) {
                sum += intArr[i];
            }
        }
        return sum;
    }
}
