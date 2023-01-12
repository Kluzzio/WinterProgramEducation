package timefall.winterprogram.lessons.completed.introtooop.practice;

public class Practice {

    public static void driver() {
        Animal myFavHerbivore = new Animal(AnimalDiet.HERBIVORE, 400);

        myFavHerbivore.canEat(Foods.BEEF);

        myFavHerbivore.eat(Foods.BEEF);
        myFavHerbivore.clearBowels();

        System.out.println("My animal weighs " + myFavHerbivore.currWeight + " after eating beef and clearing its bowels");
    }
}
