package timefall.winterprogram.lessons.completed.polymorphism.runtime.dynamic;

public class Circle extends Shapes {
    @Override
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}