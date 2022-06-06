package workspace.chap02.src.challenge.two;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("������ �Է��ϼ��� : ");
        int num = in.nextInt();
        System.out.println(num % 2 == 0 ? "¦��" : "Ȧ��");
    }
}