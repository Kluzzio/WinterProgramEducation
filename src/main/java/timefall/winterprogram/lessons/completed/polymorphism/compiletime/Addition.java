package timefall.winterprogram.lessons.completed.polymorphism.compiletime;

public class Addition
{
    void sum(int a, int b) {
        int c = a+b;
        System.out.println(" Addition of two numbers :" +c);
    }
    void sum(int a, int b, int e) {
        int c = a+b+e;
        System.out.println(" Addition of three numbers :" +c);
    }
}
