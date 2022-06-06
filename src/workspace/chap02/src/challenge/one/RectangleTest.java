package workspace.chap02.src.challenge.one;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        double w, h, area;
        Scanner in = new Scanner(System.in);
        System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
        w = in.nextDouble();
        System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
        h = in.nextDouble();
        area = w * h;
        System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
    }
}