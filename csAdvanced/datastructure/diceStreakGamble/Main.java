package csAdvanced.datastructure.diceStreakGamble;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(diceStreakGamble(new int[]{1,2,3}, new int[]{3,4,2}, new int[]{4,2,4}, new int[]{6,16,4}));
    }

    public static String diceStreakGamble(int[] player1, int[] player2, int[] player3, int[] player4){
        ArrayList<Integer> player1Result = getDollar(player1);
        ArrayList<Integer> player2Result = getDollar(player2);
        ArrayList<Integer> player3Result = getDollar(player3);
        ArrayList<Integer> player4Result = getDollar(player4);

        ArrayList<Integer> largestList = player1Result;
        String largerPlayer = "Player 1";
        if (player2Result.size() > largestList.size()) {
            largestList = player2Result;
            largerPlayer = "Player 2";
        }
        if (player3Result.size() > largestList.size()) {
            largestList = player3Result;
            largerPlayer = "Player 3";
        }
        if (player4Result.size() > largestList.size()) {
            largestList = player4Result;
            largerPlayer = "Player 4";
        }
        return "Winner: " + largerPlayer + " won $" + largestList.size()*4 + " by rolling " + largestList.toString().replace(" ", "");
    }

    private static ArrayList<Integer> getDollar(int[] player) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int previousNumber = Integer.MIN_VALUE;
        for(int num: player) {
            if(previousNumber <= num) {
                resultArray.add(num);
                previousNumber = num;
            } else {
                resultArray.clear();
                resultArray.add(num);
                previousNumber = num;
            }
        }
        return resultArray;
    }
}
