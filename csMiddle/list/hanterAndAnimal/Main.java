package csMiddle.list.hanterAndAnimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal {
    public final String species;
    public final double weightKg;
    public final double heightM;
    public boolean predator;

    public Animal(String species, double weightKg, double heightM, boolean predator) {
        this.species = species;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.predator = predator;
    }

    public void domesticate() {
        this.predator = false;
    }
}

class Hunter {
    public final String name;
    public final double weightKg;
    public final double heightM;
    public final double strength;
    public final double cageCubicMeters;

    public Hunter(String name, double weightKg, double heightM, double strength, double cageCubicMeters) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.strength = strength;
        this.cageCubicMeters = cageCubicMeters;
    }

    public double strengthKg() {
        return this.strength * this.weightKg;
    }

    public boolean canCaptureAnimal(Animal animal) {
        return strengthKg() >= animal.weightKg && this.cageCubicMeters >= animal.heightM && !animal.predator;
    }

    public boolean attemptToDomesticate(Animal animal) {
        if (this.strength > animal.weightKg * 2) {
            animal.domesticate();
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("Tiger", 290, 2.6, true);
        Animal cow = new Animal("Cow", 1134, 1.5, false);
        Animal snake = new Animal("Snake", 100, 1.2, true);
        Animal cat = new Animal("Cat", 10, 0.5, false);

        Hunter hunternator = new Hunter("Hunternator", 124.73, 1.85, 15, 3);

        List<Animal> animals = new ArrayList<>(Arrays.asList(tiger, cow, snake, cat));

        capturedAnimals(hunternator, animals);

        domesticateTheAnimals(hunternator, animals);
        capturedAnimals(hunternator, animals);
    }

    private static void capturedAnimals(Hunter hunter, List<Animal> animals) {
        for (Animal animal : animals) {
            if (hunter.canCaptureAnimal(animal)) {
                System.out.println(animal.species);
            }
        }
    }

    private static void domesticateTheAnimals(Hunter hunter, List<Animal> animals) {
        for (Animal animal : animals) {
            hunter.attemptToDomesticate(animal);
        }
    }
}