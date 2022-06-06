import java.util.Scanner;

public class SniffleQuiz2 {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        Sniffle sniffle = new Sniffle(odd, even);
        int x;

        // input() 메서드로 입력된 정수가
        // 양수일 동안만 반복
        while((x = sniffle.input()) > 0)
            System.out.print(x + " ");
        System.out.println();

        sniffle.print();
    }
}

// 다음 클래스는 홀짝에 대한 빈도수를 파악하기 위한 클래스이다.
class Sniffle2 {
    int odd = 0, even = 0;  // 홀수, 짝수의 빈도수의 저장 변수
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    // 생성자


    public Sniffle2(int odd, int even) {
        this.odd = odd;
        this.even = even;
        odd++;
        even++;

    }

    public static void input(int odd, int even) {
        // 키보드에 의하여 입력된 정수가
        // 홀수인지 짝수인지 파악한 후
        // odd, even을 하나씩 증가하는 내용의 코드
        for(int i = 0; i < odd; i++){
            if(odd % 2 == 0)
                odd++;
        }
        for(int j = 0 ; j < even; j++){
            if(even % 2 == 0)
                even++;
        }
    }

    void print() {
        // odd, even 값을 이용하여
        // 히스토그램을 별표로 표현하는 코드
        Sniffle S;
        for(int i = 0; i < odd; i++){
            System.out.print("*");
        }
        for(int j = 0; j < even; j++){
            System.out.print("*");
        }
    }
}