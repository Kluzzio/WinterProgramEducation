package timefall.winterprogram.lessons.completed.polymorphism.runtime.multidynamic.sounds;

//https://www.mygreatlearning.com/blog/polymorphism-in-java/#runtime-polymorphism-with-multilevel-inheritance
public class MultiDynamicRuntimeSounds {

    public static void driver() {
        SoundAnimal animal = new SoundAnimal();
        SoundAnimal buffalo = new Buffalo();
        SoundAnimal snake = new Snake();
        SoundAnimal tiger = new Tiger();

        animal.Sound();
        buffalo.Sound();
        snake.Sound();
        tiger.Sound();
    }
}
