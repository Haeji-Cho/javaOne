import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("전공 이수 학점: ");
        int a = in.nextInt();
        System.out.println("교양 이수 학점: ");
        int b = in.nextInt();
        System.out.println("일반 이수 학점: ");
        int c = in.nextInt();

        int sum = a + b + c;
        int bc = b + c;
        if (sum > 140) {
            if (a > 70);
            if (b > 30 && c > 30);
            if (bc > 80);
        }
        System.out.println("졸업 가능");

    }
}
