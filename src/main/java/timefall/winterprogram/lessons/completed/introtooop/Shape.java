package timefall.winterprogram.lessons.completed.introtooop;

public abstract class Shape {
    final int b = 20;
    protected final double area;

    protected static final String SHAPE_NAME = "Shape";

    protected Shape(double area) {
        System.out.println("We are in Shape constructor");
        this.area = area;
    }

    public void display() {
        System.out.println("This is display method");
    }

    abstract public double calculateArea();

    public int addB() {
        return b;
    }
}