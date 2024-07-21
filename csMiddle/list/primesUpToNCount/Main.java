package csMiddle.list.primesUpToNCount;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(primesUpToNCount(2));
    }

    public static int primesUpToNCount(int n){
        boolean[] cache = new boolean[n];
        Arrays.fill(cache, true);

        for (int currentPrime = 2; currentPrime < Math.ceil(Math.sqrt(n)); currentPrime++){
            if (!cache[currentPrime]) continue;
            int i = 2;
            int ip = i * currentPrime;
            while (ip < n){
                cache[ip] = false;
                i += 1;
                ip = i * currentPrime;
            }
        }

        ArrayList<Integer> primeNumbersDynamic = new ArrayList<>();
        for (int i = 2; i < cache.length; i++){
            if (cache[i]){
                primeNumbersDynamic.add(i);
            }
        }

        return primeNumbersDynamic.size();
    }
}
