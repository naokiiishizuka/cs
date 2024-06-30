package csMiddle.recursion.countsheep;

public class Main {
    public static void main(String[] args) {
        System.out.println(sheeps(3));
    }

    public static String sheeps(int count){
        if(count == 0) return "";
        return sheeps(count-1) + count + " sheep ~ ";
    }
}
