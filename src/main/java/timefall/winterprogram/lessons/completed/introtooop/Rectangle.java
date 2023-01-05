package timefall.winterprogram.lessons.completed.introtooop;

public class Rectangle extends Shape {

    private final int x;
    private final int y;

    public Rectangle(int x, int y) {
        super(calculateArea(x, y));
        this.x = x;
        this.y = y;
    }
    public static void test(){
        Rectangle obj = new Rectangle(1, 2);
        obj.display();
        //obj.b=200; can't be done because that field is final
        new Rectangle(3, 4);
    }
    public double calculateArea() {
        return this.x * this.y;
    }

    public double getArea() {
        return this.area;
    }

    public static double calculateArea(int x, int y) {
        return x * y;
    }
}