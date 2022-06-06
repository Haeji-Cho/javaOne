import java.awt.*;

public class chap401 {

    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        t.findArea();
    }
}

class Triangle{
    double n;
    double m;

    public Triangle(double n, double m) {
        this.n = n;
        this.m = m;
    }

    void findArea(){
        Triangle t;
        System.out.printf("%4f", n*m/2.0);
    }
}
