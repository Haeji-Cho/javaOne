public class EchoDemo {
    public static void main(String[] args) {
        echo("Hi", 3);
        echo("Bye", 2);
    }

    static void echo(String s, int n){
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }
}
