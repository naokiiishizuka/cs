package csMiddle.object.hourstoempty;

public class Main {
    public static void main(String[] args) {
        System.out.println(hoursToEmpty(0.04,98,12));
    }
    public static double hoursToEmpty(double velocity, int fuelEconomy, int tankCapacity){
        double min = fuelEconomy * tankCapacity / velocity / 3600;
        return Math.floor(min * 10) / 10;
    }
}
