public class Line {
    public static void main(String[] args) {
        Line2 a = new Line2("1");
        Line2 b = new Line2("1");

        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}

class Line2{
    String n;

    public Line2(String n) {
        this.n = n;
    }
}