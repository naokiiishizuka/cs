package csMiddle.list.evenrange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenRange(1, 2)));
    }

    public static int[] evenRange(int a, int b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=a; i<=b; i++) {
            if(i % 2 == 0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
