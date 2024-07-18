package csMiddle.list.hasPenalty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasPenalty(new int[]{1, 2, 3}));
    }

    public static boolean hasPenalty(int[] records){
        int max = 0;
        for(int i=0; i<records.length; i++) {
            if(max > records[i]) return true;
            max = records[i];
        }
        return false;
    }
}
