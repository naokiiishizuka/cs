package csMiddle.recursion.sum;

class Main {
    public static void main(String[] args) {
        System.out.println(simpleSummation(5));
    }

    public static int simpleSummation(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + simpleSummation(n - 1);
        }
    }
}