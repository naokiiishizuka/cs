package csMiddle.object.calcweightbyexercise;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcWeightByExercise("walking",150));
    }

    public static double calcWeightByExercise(String exercise, int minutes){
        double met = 0;
        switch (exercise) {
            case "running":
                met = 8;
                break;
            case "walking":
                met = 3;
                break;
            case "tennis":
                met = 5;
                break;
            case "rope jump":
                met = 9;
                break;
            default:
                met = 0;
                break;
        };
        double kcal = met * 3.5 * 85.5 / 200 * minutes;
        double consumedWeight = kcal / 7700;
        double weight = 85.5 - consumedWeight;
        return Math.floor(weight * 10) / 10.0;
    }
}
