package sec02;

public class Inheritance {
    public static void main(String[] args){
        Circle c = new Circle();
        Ball b = new Ball("빨간색");

        System.out.println("원: ");
        c.findArea();
        c.findRadius();

        System.out.println("\n공: ");
        b.findColor();
        b.findVolume();
        b.findArea();
        b.findRadius();
    }
}
