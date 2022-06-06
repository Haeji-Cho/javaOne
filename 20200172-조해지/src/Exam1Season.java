import java.util.Scanner;
/*Season class는 주어진 숫자를 달로 취그ㅂ하여 해당된 달의 계절 출력
month가 ,345면 봄 678여름 91011가을 12 1 2겨울 1-12아니면 잘못된 달*/
import java.util.Scanner;
public class Exam1Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>> ");
        int month = in.nextInt();
        Season season = new Season(month);
        System.out.println(season.show());
    }
}

class Season {
    // 필요한 변수 선언문 및 생성자
    int month;

    public Season(int month) {
        this.month = month;
    }

    String show(){
        return switch(month){
        case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 달";
        };
       // System.out.printf(month);
    }


}