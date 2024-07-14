package csMiddle.list.charinbagofwordscount;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(charInBagOfWordsCount(new String[]{"hello","world"}, 'o'));
    }

    public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter){
        int count = 0;
        for(int i=0; i<bagOfWords.length; i++) {
            for(int j=0; j<bagOfWords[i].length(); j++) {
                if(bagOfWords[i].charAt(j) == keyCharacter) {
                    count++;
                }
            }
        }
        return count;
    }

//    より効率的な書き方
//    public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter) {
//        return Arrays.stream(bagOfWords)
//                .mapToInt(word -> (int) word.chars().filter(ch -> ch == keyCharacter).count())
//                .sum();
//    }
}
