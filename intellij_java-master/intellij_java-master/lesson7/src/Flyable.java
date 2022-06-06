public class Flyable {
    public static void main(String[] args) {
        Fly f = new Fly() {
            @Override
            public void speed(String x) {
                System.out.println(x);

            }

            @Override
            public void height(String y) {
                System.out.println(y);

            }
        };

        f.speed("속도");
        f.height("높이");
    }
}

interface Fly{
    void speed(String x);
    void height(String y);
}

