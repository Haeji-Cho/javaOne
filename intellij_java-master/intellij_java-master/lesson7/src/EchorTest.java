import java.util.Scanner;

public class EchorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echor e= new Echor() {
            @Override
            void echo() {
                System.out.println();
            }
        };

        e.start();
        e.echo();
        e.stop();
    }
}

abstract class Echor{
    void start(){
        System.out.println("시작합니다.");
    }

    abstract void echo();

    void stop(){
        System.out.println("종료합니다. ");
    }
}
