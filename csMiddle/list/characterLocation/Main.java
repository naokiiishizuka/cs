package csMiddle.list.characterLocation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(characterLocation("NNNN")));
    }
    public static int[] characterLocation(String commands){
        int[] result = new int[]{0, 0};
        for(int i=0; i<commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'N': {
                    result[1]++;
                    break;
                }
                case 'E': {
                    result[0]++;
                    break;
                }
                case 'W': {
                    result[0]--;
                    break;
                }
                case 'S': {
                    result[1]--;
                    break;
                }
            }
        }
        return result;
    }
}
