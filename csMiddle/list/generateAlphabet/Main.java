package csMiddle.list.generateAlphabet;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateAlphabet('a', 'e'));
    }
    public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet) {
        firstAlphabet = Character.toLowerCase(firstAlphabet);
        secondAlphabet = Character.toLowerCase(secondAlphabet);

        if (firstAlphabet > secondAlphabet) {
            char temp = firstAlphabet;
            firstAlphabet = secondAlphabet;
            secondAlphabet = temp;
        }

        int startIndex = firstAlphabet - 'a';
        int endIndex = secondAlphabet - 'a';

        StringBuilder stops = new StringBuilder();

        if (startIndex <= endIndex) {
            for (char c = firstAlphabet; c <= secondAlphabet; c++) {
                stops.append(c);
            }
        } else {
            for (char c = firstAlphabet; c <= 'z'; c++) {
                stops.append(c);
            }
            for (char c = 'a'; c <= secondAlphabet; c++) {
                stops.append(c);
            }
        }

        return stops.toString().toCharArray();
    }
}
