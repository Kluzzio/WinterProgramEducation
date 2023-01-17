package timefall.winterprogram.lessons;

import timefall.winterprogram.lessons.completed.interfaces.multipleinterface.MultipleInterfaces;
import timefall.winterprogram.lessons.completed.interfaces.singleinterface.IAnimal;
import timefall.winterprogram.lessons.completed.interfaces.singleinterface.Interfaces;
import timefall.winterprogram.lessons.completed.introtooop.Rectangle;
import timefall.winterprogram.lessons.completed.introtooop.Shape;
import timefall.winterprogram.lessons.completed.introtooop.practice.Animal;
import timefall.winterprogram.lessons.completed.polymorphism.compiletime.MethodOverloading;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.dynamic.DynamicRuntime;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.dynamic.Square;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.genetics.MultiDynamicRuntime;
import timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.sounds.MultiDynamicRuntimeSounds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class WorkingSpace {
    
    public static void driver() {

        /* Lambda Expression */

        //(parameter) -> expression;

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(5);
        array.add(3);
        array.add(10);

        Consumer<Integer> action = n -> System.out.println(n);

        array.forEach(action);
        array.forEach(n -> System.out.println(n));


        action.accept(3);


        for (int integer : array)
            printInt(integer1 -> System.out.println(integer), integer);

        int sum = 0;
        for (int i : array)
            sum += i;

        /* Java Exceptions (very similar to other languages) */

        try {
            array.get(4);
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }

    }

    public static void printInt(Consumer<Integer> action, int integer) {
        action.accept(integer);
    }
}