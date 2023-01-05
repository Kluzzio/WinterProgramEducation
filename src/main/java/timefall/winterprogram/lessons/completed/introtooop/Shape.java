package timefall.winterprogram.lessons.completed.introtooop;

public abstract class Shape {
    final int b = 20;

    public void display() {
        System.out.println("This is display method");
    }

    abstract public double calculateArea();
}