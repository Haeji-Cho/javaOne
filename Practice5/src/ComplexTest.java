public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();

        Complex c2 = new Complex(1.5, 2.5);
        c2.print();

    }
}

class Complex{
    double n;
    double m;

    public Complex(double n) {
        this.n = n;
    }

    public Complex(double n, double m) {
        this.n = n;
        this.m = m;
    }

    public void print(){
        return;
    }
}