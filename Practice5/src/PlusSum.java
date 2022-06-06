import java.util.Scanner;

public class PlusSum {
    public static void main(String[] args) {
        int s ;
        int sum = 0;
        do{
            System.out.print("양의 정수를 입력하세요: ");
            Scanner in = new Scanner(System.in);
            s = in.nextInt();
            if(s % 2 == 0)
                sum += s;
        }while(s != 0);

        System.out.println(sum);


    }
}
