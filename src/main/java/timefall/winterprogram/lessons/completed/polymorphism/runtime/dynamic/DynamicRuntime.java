package timefall.winterprogram.lessons.completed.polymorphism.runtime.dynamic;

//https://www.mygreatlearning.com/blog/polymorphism-in-java/#runtime-polymorphism-with-multilevel-inheritance
public class DynamicRuntime {

    public static void driver() {
        Shapes s1 = new Circle();
        Shapes s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output: "Drawing a square"

        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}
