package timefall.winterprogram.lessons.completed.introtooop;

public class OOPIntro {

    //What is a class? It's a cookie cutter!
    //What is a classfile? Why is it this way?

    //What is an object? It's the cookie!

    //You've seen this kind of interaction before with data types, although ints aren't objects or classes,
    // they show a similar relationship!

    //rough approximation of concept

    //What is a method? How is this different from a function? Not all classes are created equally (utility classes)

    //What is a field?

    //What is a constructor?

    //Okay, so what? How do we use this? What information can we use?

    //What is static? What does it mean to be non-static then?

    //What is the difference between private, public, default, and protected and when should I use them?
    // (Principle of the least privilege; use getters and setters)

    //Inheritance? Does this create any issues? Square - Rectangle / Circle - Ellipse

    //final vs non-final

    //Superclass is the parent. Subclass is the child.

    //We can always upcast but not always downcast (unintuitive naming of terminology. upcast to a parent)

    //instanceof checks. Pattern variables. We love pattern variables


    public static void driver() {
        Shape shape = new Rectangle(4, 5);

        System.out.println(shape.calculateArea());

        if (Rectangle.minX == 0)
            System.out.println("Be Happy");

        float flo = 5.3f;
        int x = (int) flo;
        System.out.println(x);

        //noinspection ConstantConditions
        if (shape instanceof Rectangle rectangle) { // This is a pattern variable. We cast shape into Rectangle
            // and give it a new name for the Rectangle data type.
            System.out.println(Rectangle.calculateArea(rectangle.addB(), ((Shape) rectangle).addB()));
        }
    }
}
