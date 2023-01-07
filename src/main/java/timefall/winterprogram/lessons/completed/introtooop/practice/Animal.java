package timefall.winterprogram.lessons.completed.introtooop.practice;

import net.minecraft.util.math.MathHelper;

public class Animal {

    public final AnimalDiet diet;
    private final double maxWeight;
    public double currWeight;

    public static double MIN_WEIGHT = 100f;

    public Animal(AnimalDiet diet, double startingWeight) {
        this(diet, startingWeight, startingWeight * 2);
    }

    public Animal(AnimalDiet diet, double startingWeight, double maxWeight) {
        this.diet = diet;
        this.currWeight = startingWeight;
        this.maxWeight = maxWeight;
    }

    public void tick() {
        setChangeOfWeight(-0.03f);
    }

    public void eat(Foods foods) {
        if (canEat(foods))
            this.setChangeOfWeight(foods.getWeightValue());
    }

    public void clearBowels() {
        this.setChangeOfWeight(-50.0f);
    }

    public void setChangeOfWeight(double changeOfWeight) {
        this.currWeight = MathHelper.clamp(this.currWeight + changeOfWeight, MIN_WEIGHT, this.maxWeight);
    }

    public boolean doesEatMeat() {
        return this.diet.doesEatMeat();
    }

    public boolean doesEatPlants() {
        return this.diet.doesEatPlants();
    }

    public boolean canEat(Foods foods) {
        return this.diet.canEat(foods);
    }
}
