package csMiddle.controlflow.summationofsummation;

public class Main {
    public static void main(String[] args) {
        System.out.println(summationOfSummation(3));
    }

    public static int summationOfSummation(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                count += j;
            }
        }
        return count;
    }
}
