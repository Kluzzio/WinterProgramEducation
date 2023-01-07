package timefall.winterprogram.lessons.completed.introtooop.practice;

public enum AnimalDiet {
    HERBIVORE(true, false),
    CARNIVORE(false, true),
    OMNIVORE(true, true);

    private final boolean eatsPlants;
    private final boolean eatsMeat;

    AnimalDiet(boolean eatsPlants, boolean eatsMeat) {
        this.eatsPlants = eatsPlants;
        this.eatsMeat = eatsMeat;
    }

    public boolean doesEatMeat() {
        return eatsMeat;
    }

    public boolean doesEatPlants() {
        return eatsPlants;
    }

    public boolean canEat(Foods foods) {
        if (foods.isMeat() && !doesEatMeat())
            return false;
        return !foods.isPlant() || doesEatPlants();
    }
}
