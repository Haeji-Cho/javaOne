import java.util.Scanner;

public class Quiz2Answer {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        Sniffle sniffle = new Sniffle(odd, even);
        int x;

        //input() 메서드로 입력된 정수가
        //양수일 동안만 반복
        while((x = sniffle.input()) > 0)
            System.out.print(x + " ");
        System.out.println();

        sniffle.print();
    }
}

class Sniffle{
    int odd, even;
    Scanner in = new Scanner(System.in);

    public Sniffle(int odd, int even){
        this.odd = odd;
        this.even = even;
    }

    public int input(){
        int n = in.nextInt();
        if (n <= 0)
            return n;
        if (n % 2 == 0)
            even++;
        else odd++;
        return n;

    }

    public void print(){
        System.out.println("홀수: ");
        for(int i = 0; i < odd; i++)
            System.out.print("*");
        System.out.println();

        System.out.println("짝수: ");
        for(int j = 0; j < even; j++)
            System.out.print("*");
        System.out.println();
    }
}
