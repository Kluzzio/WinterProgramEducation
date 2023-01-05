package timefall.winterprogram.lessons;

import timefall.winterprogram.lessons.completed.introtooop.Rectangle;
import timefall.winterprogram.lessons.completed.introtooop.Shape;

public class WorkingSpace {
    //What is a class? It's a cookie cutter!

    //What is an object? It's the cookie!

    //You've seen this kind of interaction before with data types, although ints aren't objects or classes,
    // they show a similar relationship!

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

        //noinspection ConstantConditions
        if (shape instanceof Rectangle rectangle) {
            System.out.println(rectangle.calculateArea());
        }

    }
}