import javax.crypto.spec.PSource;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        System.out.println("양의 정수를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        isPrime(in.nextInt());
    }
    public static void isPrime(int num){
        if(num < 2){
            System.out.println("소수입니다.");
            return;
        }
        if(num == 2){
            System.out.println("소수입니다.");
            return;
        }
        for(int i = 2; i < num; i++ ){
            if(num % i == 0){
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
        return;
    }
}
