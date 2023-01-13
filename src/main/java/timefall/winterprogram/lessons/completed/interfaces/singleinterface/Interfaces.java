package timefall.winterprogram.lessons.completed.interfaces.singleinterface;

//https://www.w3schools.com/java/java_interface.asp
public class Interfaces {

    public static void driver() {
        IAnimal myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
