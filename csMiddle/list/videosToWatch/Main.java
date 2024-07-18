package csMiddle.list.videosToWatch;

public class Main {
    public static void main(String[] args) {
        System.out.println(videosToWatch(new int[]{1, 2, 1, 3, 4}, 5));
    }
    public static int videosToWatch(int[] time, int dailyGoal){
        int sum = 0;
        for(int i=0; i<time.length; i++) {
            sum += time[i];
            if(sum >= dailyGoal) return i+1;
        }
        return -1;
    }
}
