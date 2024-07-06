package csMiddle.controlflow.redirectionurl;

public class Main {
    public static void main(String[] args) {
        System.out.println(redirectionUrl("Japanese"));
    }
    public static String redirectionUrl(String language){
        String res;
        switch (language) {
            case "English":
                res = "en";
                break;
            case "Japanese":
                res = "ja";
                break;
            case "Spanish":
                res = "es";
                break;
            case "Russian":
                res = "ru";
                break;
            default:
                res = "";
                break;
        }
        return "www.example.org/" + res;
    }
}
