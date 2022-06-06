import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("초 단위 정수를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int a = i /60 /60;
        int b = i / 60 % 60;
        int c = i % 60;
        System.out.printf("%4d시간,  %4d분,  %4d초", a, b, c);
    }
}
