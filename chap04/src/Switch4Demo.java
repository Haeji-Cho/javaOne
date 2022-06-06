import java.util.Scanner;

public class Switch4Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("? ");
        int i = in.nextInt();

        String s = switch (i) { //String을 사용하는 경우
            case 1:
                System.out.println("최우등");
                yield "one";
            case 2, 3: //두 개를 넣을 수 있다.
                System.out.println("우등");
                yield "two or three";
            default:
                System.out.println("$%^&");
                yield "else";

        };
    }
}
