package csMiddle.controlflow.perfectnumberlist;

public class Main {
    public static void main(String[] args) {
        System.out.println(perfectNumberList(3));
    }
    public static String perfectNumberList(int n){
        StringBuilder builder = new StringBuilder();
        for(int i=2; i<=n; i++) {
            if(isPerfectNumber(i)) {
                if(i==6) {
                    builder.append(i);
                } else {
                    builder.append('-');
                    builder.append(i);
                }
            }
        }
        if(builder.isEmpty()) return "none";
        else return builder.toString();
    }

    private static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i==0) sum+=i;
        }
        return sum == n;
    }
}
