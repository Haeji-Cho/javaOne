public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(10.0);
        c.draw();

        Shape s = new Circle(3.0);
        s.draw();

        Square q = new Square(4.0);
        q.draw();

    }
}
