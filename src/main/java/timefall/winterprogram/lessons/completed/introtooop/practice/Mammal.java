package timefall.winterprogram.lessons.completed.introtooop.practice;

import java.util.Random;

public class Mammal extends Animal {

    public static boolean isWarmBlooded = true;
    public static boolean isVertebrate = true;

    public boolean mateless = true;
    public Mammal mate;

    public Mammal(AnimalDiet diet, double startingWeight) {
        super(diet, startingWeight);
    }

    @Override
    public void tick() {
        super.tick();
        if (mateless)
            lookForMate();
        else {
            attemptMating(this.mate);
        }
    }

    public void lookForMate() {
        if (new Random().nextInt(100) < 25) {
            mateless = false;
            mate = new Mammal(this.diet, this.currWeight - 20F);
        }
    }

    public void attemptMating(Mammal mate) {
        if (mate.getClass() == this.getClass()) {
            if (new Random().nextInt(10) <= 1) {
                //success, create child
                System.out.println("It's a " + (new Random().nextBoolean() ? "boy!" : "girl!"));
            }
        }
    }
}