import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.println("0-999 사이의 숫자를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        int b = i /100;
        int c = i % 10;
        int a = i % 100 / 10;

        System.out.printf("각 자릿수의 합은 %d",a+b+c);

    }
}
