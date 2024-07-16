package csMiddle.list.maxAscilString;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxAscilString(new String[]{"eatDjrPNbj","IehUUSEMVe","hpcbBvlTOc","egvnPZgyCh"}));
    }

    public static int maxAscilString(String[] stringList){
        int maxIndex = 0;
        int maxAscii = 0;
        for(int index = 0; index < stringList.length; index++) {
            int asciisum = getAsciiSum(stringList[index]);
            if(maxAscii < asciisum) {
                maxIndex = index;
                maxAscii = asciisum;
            }
        }
        return maxIndex;
    }

    private static int getAsciiSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i); // 各文字のASCII値を取得して合計に追加
        }
        return sum;
    }
}
