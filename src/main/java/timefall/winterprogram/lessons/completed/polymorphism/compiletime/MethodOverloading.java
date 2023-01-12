package timefall.winterprogram.lessons.completed.polymorphism.compiletime;

//https://www.mygreatlearning.com/blog/polymorphism-in-java/#runtime-polymorphism-with-multilevel-inheritance
public class MethodOverloading {

    public static void driver() {
        Shapes myShape = new Shapes();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0,1.2);
        myShape.area(6,2);

        Addition obj = new Addition();
        obj.sum ( 30,90);
        obj.sum(45, 80, 22);
    }
}
