package workspace.chap10.src.sec01;

interface Negative {
    int neg(int x);
}

interface Printable {
    void print();
}

public class Lambda2Demo {
    public static void main(String[] args) {
        Negative n;
        n = (int x) -> { return -x; };

        n = (x) -> { return -x; };

        n = x -> { return -x; };

        n = (int x) -> -x;

        n = (x) -> -x;

        n = x -> -x;

        Printable p;

        p = () -> { System.out.println("�ȳ�!"); };

        p = () -> System.out.println("�ȳ�!");

        p.print();
    }
}