package timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.genetics;

//https://www.mygreatlearning.com/blog/polymorphism-in-java/#runtime-polymorphism-with-multilevel-inheritance
public class MultiDynamicRuntime {

    public static void driver() {
        Grandfather f1,f2,f3;
        f1 = new Grandfather();
        f2 = new Father();
        f3 = new Son();
        f1.swim();
        f2.swim();
        f3.swim();
    }
}
