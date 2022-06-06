import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < a; b++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
