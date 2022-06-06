import java.util.Scanner;

public class PrimeQuiz1 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Prime p;

        System.out.print(n + "이하의 모든 소수는 ");
        for (int i = 2; i <= n; i++) {
            // 필요한 코드 추가
            if(Prime.isPrime(i) == true){
                System.out.printf("%4d", i);
            }
        }
    }
}

// 소수(prime number)에 관련된 클래스
class Prime {
    int x;

    // 생성자 추가
    public Prime(int n){
        x = n;
    }

    // x가 소수인지 아닌지를 판단하는 메서드
    public static boolean isPrime(int x) {
        // 필요한 코드 추가
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        for(int i = 2; i < x; i++ ){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}