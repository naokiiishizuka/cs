package csMiddle.list.countallchars;

public class Main {

    public static void main(String[] args) {
        System.out.println(countAllChars(new String[]{"The wood","Pecked peckers","At the inn","Tomorrowland"}));
    }

    public static int countAllChars(String[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            count += arr[i].length();
        }
        return count;
    }
}
