package csMiddle.list.countcharactersaftern;

public class Main {
    public static void main(String[] args) {
        System.out.println(countCharactersAfterN(new String[]{"The wood","Pecked peckers","At the inn","Tomorrowland"}));
    }
    public static int countCharactersAfterN(String[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) >= 'n') {
                    count++;
                }
            }
        }
        return count;
    }
}
