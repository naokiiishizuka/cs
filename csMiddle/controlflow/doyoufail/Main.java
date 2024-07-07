package csMiddle.controlflow.doyoufail;

public class Main {
    public static void main(String[] args) {
        System.out.println(doYouFail("AAPPAP"));
    }
    public static String doYouFail(String string){
        int count=0;
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i) == 'A')count++;
        }
        if(count>=3) return "fail";
        else return "pass";
    }
}
