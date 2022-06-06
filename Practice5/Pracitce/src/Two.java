import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.printf("%d,%4d",i ,  i * i);
    }
}
