public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("정사각형을 그리다");
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
