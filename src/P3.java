import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 10;
        int sum = 0;
        do{
            System.out.println("양의 정수를 입력하세요: ");
            int a = in.nextInt();
            if(a % 2 == 0)
                sum += a;
            if (a < 0) {
                System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d", sum);
                break;
            }

            i--;
        }while(i > 0);

    }
}
