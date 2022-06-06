import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("F 화씨온도를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        float i = in.nextFloat();
        float c = ((i - 32)/ 9) * 5;

        System.out.printf("%f", c);

    }
}
