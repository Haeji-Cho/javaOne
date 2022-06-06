import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("원기둥의 밑면 반지름은? ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("원기둥의 높이는? ");
        int j = in.nextInt();

        double y = i * i * 3.14 * j;

        System.out.printf("%f", y);
    }
}
