public class p33 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.);
        Triangle t3 = new Triangle(8.0, 8.0);
        System.out.println("삼각형 넓이는 " + t.findArea());
        //System.out.println(t1.isSameArea(t2));
        //System.out.println(t1.isSameArea(t3));
    }
}

class Triangle{
    double high;
    double bott;

    public Triangle(double h, double b){
        high = h;
        bott =b;
    }

    double findArea(){
        return high * bott /2;
    }

    /*String isSameArea(){
        return
    }
*/
}
