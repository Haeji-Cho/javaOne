import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("등수를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        String s = switch (i){
            case 1 -> "아주 잘했습니다.";
            case 2, 3 -> "잘했습니다.";
            case 4, 5, 6 -> "보통입니다.";
            default -> "노력해야겠습니다.";
        };
        System.out.println(s);
    }
}
