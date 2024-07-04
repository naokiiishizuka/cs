package csMiddle.recursion.howlongtoreachfundgoal;

public class Main {

    public static void main(String[] args) {
        System.out.println(howLongToReachFundGoal(5421,10421,5));
    }
    public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest){
        return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, 0);
    }

    public static int howLongToReachFundGoalHelper(double capitalMoney, double goalMoney, double interest, int count){
        if(count >= 80) return 80;
        if(capitalMoney > goalMoney) return count;
        capitalMoney += capitalMoney * (interest / 100.0);

        if (count % 2 == 0) {
            goalMoney += goalMoney * 0.02; // 偶数年
        } else {
            goalMoney += goalMoney * 0.03; // 奇数年
        }
        return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, ++count);
    }
}
