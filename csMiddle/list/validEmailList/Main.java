package csMiddle.list.validEmailList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(validEmailList(new String[]{"ab", "bc"})));
    }
    public static String[] validEmailList(String[] emailList){
        ArrayList<String> validEmailList = new ArrayList<String>();
        for(String email: emailList) {
            if(isValidEmail(email)) validEmailList.add(email);
        }
        return convertToStringArray(validEmailList);
    }

    public static String[] convertToStringArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static boolean isValidEmail(String email) {
        // スペースがないこと
        if (email.contains(" ")) {
            return false;
        }
        // 「@」を 1 つのみ含んでいること
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@')) {
            return false;
        }
        // 「@」の後に「.」があること
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1) {
            return false;
        }
        // 「@」から始まらないこと
        if (atIndex == 0) {
            return false;
        }
        return true;
    }
}
