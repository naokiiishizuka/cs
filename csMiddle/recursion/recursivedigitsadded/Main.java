package csMiddle.recursion.recursivedigitsadded;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveDigitsAdded(29135485405253L));
    }

    public static int recursiveDigitsAdded(long digits) {
        return recursiveDigitsAddedHelper(digits, 0);
    }

    private static int recursiveDigitsAddedHelper(long digits, int accumulatedSum) {
        if (digits < 10 && accumulatedSum == 0) {
            return (int) digits;
        }
        if (digits < 10) {
            return accumulatedSum;
        }

        long sum = sumEachDigits(digits, 0);
        return recursiveDigitsAddedHelper(sum, accumulatedSum + (int) sum);
    }

    public static long sumEachDigits(long digits, long total) {
        if(digits < 10) return total+digits;
        long number = digits % 10;
        return sumEachDigits(digits/10, total+number);
    }
}
