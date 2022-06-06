import java.util.Scanner;

public class Switch3Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("? ");
        int i = in.nextInt();

        String s = switch (i) {
            case 4, 5 -> "exr"; //두 개를 같이 사용할 수도 있다.
            case 3 -> "three";
            case 2 -> "two";
            case 1 -> "one";
            default -> {
                System.out.println("...");
                yield "oops";
            }  //모든 변수에 대한 case 라벨이 있어야 한다. 또한 다른 방식으로 출력하는 방식을 표현함

        };
        System.out.println(s);
    }
}
