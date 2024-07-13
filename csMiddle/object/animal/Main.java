package csMiddle.object.animal;

class Animal {
    private final String name;
    private final double weightKg;
    private final double heightM;
    private final boolean isPredator;
    private final double speedKph;
    private final double  activityMultiplier;

    public Animal(String name, double weightKg, double heightM, boolean isPredator, double speedKph) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.isPredator = isPredator;
        this.speedKph = speedKph;
        this.activityMultiplier = 1.2;
    }

    public double getBmi() {
        double bmi = weightKg / Math.pow(heightM, 2);
        return Math.floor(bmi * 100) / 100;
    }

    public double getDailyCalories() {
        double dailyCalories = (70 * Math.pow(weightKg, 0.75)) * activityMultiplier;
        return Math.floor(dailyCalories * 100) / 100;
    }

    public boolean isDangerous() {
        return isPredator || heightM >= 1.7 || speedKph >= 35;
    }
}

class MyClass{
    public static void main(String[] args){
        Animal rabbit = new Animal("rabbit", 10, 0.3, false, 20);
        System.out.println(rabbit.getBmi());
        System.out.println(rabbit.isDangerous());

        Animal snake = new Animal("snake", 30, 1, true, 30);
        System.out.println(snake.isDangerous());
        System.out.println(snake.getDailyCalories());

        Animal elephant = new Animal("elephant", 300, 3, false, 5);
        System.out.println(elephant.getBmi());
        System.out.println(elephant.getDailyCalories());

        Animal gazelle = new Animal("gazelle", 50, 1.5, false, 100);
        System.out.println(gazelle.getDailyCalories());
        System.out.println(gazelle.isDangerous());
    }
}
