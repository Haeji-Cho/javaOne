import java.util.Scanner;

public class Switch1Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("? ");
        int i = in.nextInt();

        switch (i){
            case 3:
                System.out.println("***");
                //break; //만약 여기서 break 실행하면 ***만 실행되고 뒤를 뛰어넘음
            case 2:
                System.out.println("**");
                //break;
            case 1:
                System.out.println("*");
                //break
            default: //하지만 3, 2, 1을 입력해도 -이 출력되므로 우리의 뜻과 다르게 출력된다.
                System.out.println("-");

        }
    }
}
