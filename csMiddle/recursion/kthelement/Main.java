package csMiddle.recursion.kthelement;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthElement(4, 5));
    }
    public static char kthElement(int n, int k) {
        // ベースケース: 1行目は常に "0"
        if (n == 1) {
            return '0';
        }

        // 前の行の長さは 2^(n-1)
        int lengthOfPrevRow = 1 << (n - 1);

        // k が前の行の前半部分に含まれる場合
        if (k <= lengthOfPrevRow / 2) {
            return kthElement(n - 1, k);
        } else {
            // k が前の行の後半部分に含まれる場合
            char prevChar = kthElement(n - 1, k - lengthOfPrevRow / 2);
            // 文字を反転 ('0' -> '1', '1' -> '0')
            return (prevChar == '0') ? '1' : '0';
        }
    }
}
