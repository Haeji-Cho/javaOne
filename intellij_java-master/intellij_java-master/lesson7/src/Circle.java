public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("원을 그리다");

    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }

    void show() {
        System.out.println("원을 보여주다");
    }
}
