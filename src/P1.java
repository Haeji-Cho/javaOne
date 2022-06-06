import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        if(i > 19)
            System.out.println("성년");
        else System.out.println("청소년");

    }
}
