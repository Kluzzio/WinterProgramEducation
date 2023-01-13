package timefall.winterprogram.lessons.completed.interfaces.singleinterface;

public class Pig implements IAnimal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
