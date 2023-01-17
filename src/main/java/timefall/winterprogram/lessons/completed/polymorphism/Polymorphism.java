package timefall.winterprogram.lessons.completed.polymorphism;

import timefall.winterprogram.lessons.completed.interfaces.multipleinterface.MultipleInterfaces;
import timefall.winterprogram.lessons.completed.interfaces.singleinterface.Interfaces;
import timefall.winterprogram.lessons.completed.introtooop.Rectangle;
import timefall.winterprogram.lessons.completed.introtooop.Shape;
import timefall.winterprogram.lessons.completed.polymorphism.compiletime.MethodOverloading;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.dynamic.DynamicRuntime;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.genetics.MultiDynamicRuntime;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.sounds.MultiDynamicRuntimeSounds;

public class Polymorphism {
    public static void driver() {
        // You are able to create abstract class objects, but it is not best practice.
        // When creating an abstract object, you must implement all the methods that are declared abstract.
        Shape dondothis = new Shape(25.0f) {
            @Override
            public double calculateArea() {
                return 25.0f;
            }
        };

        dondothis.calculateArea();

        Shape rect = new Rectangle(5, 5);

        rect.calculateArea();

        /* POLYMORPHISM */

        /*
         * Runtime -
         * These both result in 25, because both objects override the calculateArea method from Shape.
         * rect.calculateArea() calls the overridden method as it exists within the Rectangle class because
         * the created object is still a Rectangle, despite being upcast to a Shape
         */

        /*
         * Compile time -
         * What is method overloading? We can declare multiple methods of the same name with different method signatures
         * (parameters) and the compiler will designate the call to the correct method
         */

        /*
         * Runtime -
         * What is method overriding? We mask the inheritance of a method by creating a method in the child with the
         * same method signature. This allows for the inherited behavior to be discarded in favor of new,
         * custom behavior while retaining reference to the inherited method.
         */

        // What is the main advantage of interfaces? You can implement more than one to have a de facto version of multiple inheritance.

        MethodOverloading.driver();
        DynamicRuntime.driver();
        MultiDynamicRuntime.driver();
        Interfaces.driver();
        MultipleInterfaces.driver();
        MultiDynamicRuntimeSounds.driver();
    }
}
