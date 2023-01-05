package timefall.winterprogram.lessons.completed.introtooop;

public abstract class Shape {
    final int b = 20;
    protected final double area;

    protected Shape(double area) {
        this.area = area;
    }

    public void display() {
        System.out.println("This is display method");
    }

    abstract public double calculateArea();
}