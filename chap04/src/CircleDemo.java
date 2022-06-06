public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("빨강");
        c1.show();
        System.out.println("원의 색상은 " + c1.getColor() + "입니다. ");

    }
}

class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void show(){
        System.out.println("반지름이 "+ radius + " 색깔은 " + color);
    }
}
