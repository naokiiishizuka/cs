package csMiddle.controlflow.hammingdistanceInstring;

public class Main {
    public static void main(String[] args) {
        System.out.println(hammingDistanceInString("toned","roses"));
    }

    public static int hammingDistanceInString(String string1, String string2){
        var count = 0;
        for(int i=0; i<string1.length(); i++) {
            if(string1.charAt(i) != string2.charAt(i)) count++;
        }
        return count;
    }
}
