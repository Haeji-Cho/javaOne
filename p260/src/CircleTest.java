public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5), new ColoredCircle(3, "빨간색")};
        for(Circle c: circles)
            c.show();
    }
}

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void show(){
        System.out.println("반지름이 " + radius + "인 원이다. ");
    }
}

class ColoredCircle extends Circle{ //Circle을 초기화시켜야 한다.
    String color;


    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + "원이다. ");
    }
}