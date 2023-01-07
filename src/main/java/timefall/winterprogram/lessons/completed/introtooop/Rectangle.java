package timefall.winterprogram.lessons.completed.introtooop;

public class Rectangle extends Shape {

    public static final int minX = 0;

    private final int x;
    private final int y;

    public Rectangle(int x, int y) {
        super(calculateArea(x, y));
        System.out.println("We are in rectangle constructor " + getArea());
        this.x = x;
        this.y = y;
        String shapeName = SHAPE_NAME;
    }
    public static void test(){
        Rectangle obj = new Rectangle(1, 2);
        obj.display();
        //obj.b=200; can't be done because that field is final
        new Rectangle(3, 4);
    }

    @Override
    public double calculateArea() {
        return this.x * this.y;
    }

    public double getArea() {
        return this.area;
    }

    public static double calculateArea(int x, int y) {
        return x * y;
    }

    @Override
    public void display() {
        System.out.println("We are in rectangle display!");
        super.display();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int addB() {
        return b + super.addB();
    }
}