package csMiddle.controlflow.twoscomplement;

public class Main {
    public static void main(String[] args) {
        System.out.println(twosComplement("00"));
    }

    public static String twosComplement(String bits){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<bits.length(); i++) {
            if(bits.charAt(i) == '0') builder.append('1');
            else builder.append('0');
        }

        for(int i=builder.length()-1; i>=0; i--) {
            if(builder.toString().charAt(i) == '0') {
                builder.setCharAt(i, '1');
                break;
            } else {
                builder.setCharAt(i, '0');
                if(i == 0) {
                    builder.insert(0, '1');
                }
            }
        }
        return builder.toString();
    }

//    for文を一つで評価
//    public static String twosComplement(String bits) {
//        if (bits.length() != 8) {
//            throw new IllegalArgumentException("Input must be an 8-bit binary string.");
//        }
//
//        StringBuilder complementBits = new StringBuilder();
//        boolean foundOne = false;
//
//        for (int i = bits.length() - 1; i >= 0; i--) {
//            char bit = bits.charAt(i);
//            if (foundOne) {
//                complementBits.append(bit == '0' ? '1' : '0');
//            } else {
//                complementBits.append(bit);
//                if (bit == '1') {
//                    foundOne = true;
//                }
//            }
//        }
//
//        if (!foundOne) {
//            complementBits.append('1');
//        }
//
//        return complementBits.reverse().toString();
//    }
}
