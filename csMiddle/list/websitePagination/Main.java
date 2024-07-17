package csMiddle.list.websitePagination;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(websitePagination(new String[]{"url1","url2","url3","url4","url5","url6"}, 4, 2)));
    }
    public static String[] websitePagination(String[] urls, int pageSize, int page){
        ArrayList<String> displayUrls = new ArrayList<String>();
        int startPage = pageSize * (page-1);
        for(int i=startPage; i<startPage+pageSize; i++) {
            if(i>=urls.length) break;
            displayUrls.add(urls[i]);
        }
        return convertToStringArray(displayUrls);
    }

    private static String[] convertToStringArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
