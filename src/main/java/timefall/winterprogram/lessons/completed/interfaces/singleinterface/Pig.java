package timefall.winterprogram.lessons.completed.interfaces.singleinterface;

import timefall.winterprogram.lessons.completed.interfaces.singleinterface.IAnimal;

public class Pig implements IAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
