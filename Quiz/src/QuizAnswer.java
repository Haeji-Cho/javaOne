import java.util.Scanner;

public class QuizAnswer {
    public static void main(String[] args) {
        System.out.println("정수? ");
        Scanner in = new Scanner(System.in);
        Prime1 p;

        int n = in.nextInt();
        System.out.println(n + "이하의 소수는 ");
        for (int i = 2; i < n; i++){
            p = new Prime1(i);
            if (p.isPrime())
                System.out.println(i + " ");
        }
    }
}

class Prime1{
    int x;

    public Prime1(int x) {  //Alt + Insert 누르면 생성자 만들어짐
        this.x = x;
    }

    boolean isPrime(){
        for (int i = 2; i <= x/2; i++){
           if (x % i == 0)
               return false;
        }
        return true;
    }
}



