package csMiddle.object.hourstolose1kgbyexercise;

public class Main {
    public static void main(String[] args) {
        System.out.println(hoursToLose1KgByExercise("tennis"));
    }

    public static double hoursToLose1KgByExercise(String exercise){
        double weight = 85.5;
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
        double kcal = met * 3.5 * weight / 200;
        double hour = 7700 / kcal / 60;
        return Math.floor(hour * 10) / 10.0;
    }
}
