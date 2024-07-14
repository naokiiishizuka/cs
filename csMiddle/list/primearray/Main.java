package csMiddle.list.primearray;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeArray(5)));
    }

    public static int[] primeArray(int n){
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) primeList.add(i);
        }
        return primeList.stream().mapToInt(i -> i).toArray();
    }

    private static Boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
