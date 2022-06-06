public class triangleP1 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea);
    }
}

class Triangle{
    double bottom;
    double high;

    public Triangle(double bottom, double high){
        this.bottom = bottom;
        this.high = high;
    }

    static double findArea;

    public void Triangle(){
        findArea = high * bottom /2;
        System.out.println(findArea);
    }
}
