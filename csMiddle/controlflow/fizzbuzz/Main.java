package csMiddle.controlflow.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(12));
    }

    public static String fizzBuzz(int n){
        StringBuilder builder = new StringBuilder();
        for(int i=1; i<=n; i++) {
            if(i%15==0) builder.append("FizzBuzz");
            else if(i%5==0) builder.append("Buzz");
            else if(i%3==0) builder.append("Fizz");
            else builder.append(i);
            if(i!=n) builder.append('-');
        }
        return builder.toString();
    }
}
